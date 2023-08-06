package com.jka.java.rest.app.JavaRestApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jka.java.rest.app.JavaRestApp.entety.Corces;
import com.jka.java.rest.app.JavaRestApp.services.CorcesServices;

@RestController
public class Controller {

	@Autowired
	protected CorcesServices corcesServices;

	@GetMapping("/home")
	public String wellcome() {
		return corcesServices.wellcome();
	}

	@GetMapping("/corces")
	public List<Corces> getCorces() {
		return corcesServices.getCorces();
	}
	
	@GetMapping("/corce/{corceId}")
	public Object getCorcesById(@PathVariable String corceId) {
		try {
		return corcesServices.getCorcesById(Integer.parseInt(corceId));
		}catch(Exception e) {
			return new String("No such Corces present");
		}
	}
	
	@PutMapping("/update")
	public Object updateCorces(@RequestBody Corces corce) {
	  
		try {
			return corcesServices.updatCorces(corce);
		} catch (Exception e) {
			return  "No such Corces present";
		}
	}
	
	@PostMapping("/addcorces")
	public List<Corces> addCorces(@RequestBody Corces corces){
		return corcesServices.addCorces(corces);
	}
	
	@DeleteMapping("/deletecorce")
	public List<Corces> deleteCorce(@RequestBody Corces corces){
		try {
			return corcesServices.deleteCorces(corces);
		} catch (Exception e) {
			return corcesServices.getCorces();
		}
	}
}
