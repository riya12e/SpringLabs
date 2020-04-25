package com.capg.mvc.dao;

import java.util.List;


import com.capg.mvc.entities.Trainee;

public interface TraineeDao {

	
	    public Trainee findById(Integer id);
	    public List<Trainee> findAll();
		public void delete(Integer id);
		public void modify(Trainee t);
		public Trainee addTrainee(Trainee trainee);
}
