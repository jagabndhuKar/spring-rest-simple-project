package com.jka.java.rest.app.JavaRestApp.services;

import java.util.List;

import com.jka.java.rest.app.JavaRestApp.entety.Corces;

public interface CorcesServices {

	public String wellcome(); 
	
	public List<Corces> getCorces();
	
	public Object getCorcesById(long id)throws Exception;
	
	public Corces updatCorces(Corces recivedCorces) throws Exception;
	
	public List<Corces> addCorces(Corces corces);
	
	public List<Corces> deleteCorces(Corces recivedCorces) throws Exception;
}
