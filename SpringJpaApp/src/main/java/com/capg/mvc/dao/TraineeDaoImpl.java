package com.capg.mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capg.mvc.entities.Trainee;


@Repository
public class TraineeDaoImpl implements TraineeDao {
	
	@PersistenceContext
     EntityManager em;
    
    
    public Trainee addTrainee(Trainee trainee) {
        em.persist(trainee);
		return trainee;
       
    }

   
    public Trainee findById(Integer traineeId) {
        return em.find(Trainee.class, traineeId);
    }

   
    public List<Trainee> findAll() {
        Query query = em.createQuery("select t from Trainee t", Trainee.class);
        List<Trainee> trainees=query.getResultList();
        return trainees;
        
     }


	public void delete(Integer traineeId) {
		// TODO Auto-generated method stub
		Trainee tr= em.find(Trainee.class, traineeId);
		em.remove(tr);
		
		
	}


	public void modify(Trainee t) {
		em.merge(t);
	}




	/*@PersistenceContext
	private EntityManager entityManager;
		
	public Trainee addTrainee(Trainee trainee) {
		
		entityManager.persist(trainee);
		return trainee;
		 
	*/	
	}

