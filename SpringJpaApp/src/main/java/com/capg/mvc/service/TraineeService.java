package com.capg.mvc.service;

import java.util.List;

import com.capg.mvc.entities.*;
public interface TraineeService{
	
	Trainee addTrainee(Trainee trainee);

	public  Trainee find(int traineeId);
   public List<Trainee> getAll();
 
    public void delete(int traineeId);
    public void modify(Trainee t);
}
