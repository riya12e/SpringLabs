package com.capg.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.capg.mvc.entities.Trainee;
import com.capg.mvc.exception.TraineeNotFoundException;
import com.capg.mvc.service.TraineeService;




@Controller
@RequestMapping("/")
public class TraineeController {
	@Autowired  TraineeService service;
	
	
	
	@RequestMapping(value="/loginadmin",method=RequestMethod.POST)
	public String loggedIn(ModelMap model,@RequestParam("userName")String user,@RequestParam("password")String pass){
		if(user.equals("admin")&&pass.equals("a"))				
		return "links";
		else
		return "index";
	}
	
	//Adding
	@RequestMapping(value="/addTrainee",method=RequestMethod.GET)
	public String add(){

			return "addTrainee";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addtrainee(@ModelAttribute("trainee") Trainee trainee,ModelMap model) {
	        
	    	Trainee savedtrainee= service.addTrainee(trainee);
	    	 if(savedtrainee==null)
	    		 model.addAttribute("msg","Trainee is already added");
	    	 else
	    	 model.addAttribute("msg","Trainee "+trainee.getTraineeName()+" added successfuly!");
	         
	 	    return "success";
	}
	
    
	@RequestMapping(value="/link")
	public String moveBack(){

			return "links";
	}
	
		//Delete Trainee........................................
	@RequestMapping(value="/deletetrainee",method=RequestMethod.GET)
	public String delete() {
		//model.addAttribute("msg"," Delete Trainee");
		return "deletetrainee";
	}
	
	@RequestMapping(value="/find",method=RequestMethod.POST)
	public String deleteById(ModelMap model,@RequestParam("traineeId") int id) {
		Trainee trainee=service.find(id);
		if(trainee==null)
			throw new TraineeNotFoundException("Trainee is not present with given Id: "+id);
		model.addAttribute("trainee",trainee);
		return "deletetrainee";
	}
	
	@RequestMapping(value="/delete/{traineeId}",method=RequestMethod.POST)
	public String delete(ModelMap model,@PathVariable("traineeId") int id) {
		service.delete(id);
		model.addAttribute("msg","Trainee Deleted Successfuly");
		return "success";
	}
	
	//modify trainee..........................................
		@RequestMapping(value="/modifytrainee",method=RequestMethod.GET)
		public String modify(Model model) {
		    return "modifytrainee";
		}
		
		@RequestMapping(value="/modify",method=RequestMethod.POST)
		public String modifyById(ModelMap model,@RequestParam("traineeId") int id) {
			Trainee trainee=service.find(id);
			if(trainee==null)
				throw new TraineeNotFoundException("Trainee is not present with given Id"+id);
			model.addAttribute("trainee",trainee);
			return "modifytrainee";
		}
		
		@RequestMapping(value="/modifytrainee",method=RequestMethod.POST)
		public String modify(ModelMap model,@ModelAttribute("trainee") Trainee trainee) {
			service.modify(trainee);
			model.addAttribute("msg","Trainee "+trainee.getTraineeId()+" modified");
			return "success";
		}

	//retrieve trainee by id............................
	@RequestMapping(value="/retrievetrainee",method=RequestMethod.GET)
	public String retrieve(ModelMap model) {
		model.addAttribute("msg","Retrieve Trainee");
		return "retrievetrainee";
	}
	
	@RequestMapping(value="/findTrainee",method=RequestMethod.POST)
	public String retrievebyid(ModelMap model,@RequestParam("traineeId") int id ) {
		
		Trainee trainee=service.find(id);
		if(trainee==null)
			throw new TraineeNotFoundException("Trainee is not present with given Id:"+id);
		model.addAttribute("trainee",trainee);
		return "retrievetrainee";
	}
	
	List<Trainee> trainees=new ArrayList<Trainee>();
	//for retrieving all trainee..................
		@RequestMapping(value="/retrievealltrainee",method=RequestMethod.GET)
		public String retrieveall(ModelMap model) {
			trainees=service.getAll();
			model.addAttribute("trainees", trainees);
			
			return "retrievealltrainee";
		}
	
}

		

		
		
		
		


