package com.capg.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.capg.mvc.dao.TraineeDao;
import com.capg.mvc.entities.Trainee;
import com.capg.mvc.service.TraineeService;


@Service
public class TraineeServiceImpl implements TraineeService {

	 @Autowired TraineeDao dao;
	    
	 @Transactional
		@Override
		public Trainee addTrainee(Trainee trainee) {
			// TODO Auto-generated method stub
			return dao.addTrainee(trainee);
		}
	  
	 @Transactional
	 @Override
	 public Trainee find(int traineeId) {
	        Trainee t=dao.findById(traineeId);
	    	
	    		return t;
	    	
	    }

	 @Transactional 
	 @Override
	    public List<Trainee> getAll() {
	        return dao.findAll();
	    }

	 @Transactional 
	 @Override
		public void delete(int traineeId) {
			// TODO Auto-generated method stub
			Trainee t=dao.findById(traineeId);
			
			dao.delete(traineeId);
			
		}
	 
	 @Transactional
	 @Override
		public void modify(Trainee t) {
			// TODO Auto-generated method stub
			Trainee t1=dao.findById(t.getTraineeId());
			
			
				dao.modify(t);
			
		}

	

		
	}

