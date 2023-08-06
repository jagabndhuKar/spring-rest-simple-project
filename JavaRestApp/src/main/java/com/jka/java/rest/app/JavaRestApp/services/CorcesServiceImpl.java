package com.jka.java.rest.app.JavaRestApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jka.java.rest.app.JavaRestApp.entety.Corces;

@Service
public class CorcesServiceImpl implements CorcesServices {

	protected List<Corces> corces;
	
	public CorcesServiceImpl() {
		super();
		corces = new ArrayList<Corces>();
		corces.add(new Corces(1, "Java", 1000));
		corces.add(new Corces(2, "python", 900));
		corces.add(new Corces(3, "c++", 800));
	}

	@Override
	public String wellcome() {
		return "wellcome to jka java rest demo project";
	}

	@Override
	public List<Corces> getCorces() {
		return corces;
	}

	@Override
	public Object getCorcesById(long id) throws Exception {
		return	corces.stream().filter(t -> t.getId() == id).findFirst().orElseThrow();
	}

	@Override
	public Corces updatCorces(Corces recivedCorces) throws Exception {
		Corces corce = this.corces.stream().filter(t -> t.getId() == recivedCorces.getId()).findFirst().orElse(null);
		if(corce != null) {
			corce.setName(recivedCorces.getName());
			corce.setPrice(recivedCorces.getPrice());
		}else {
			throw new IndexOutOfBoundsException();
		}
		return corce;
		
	}

	@Override
	public List<Corces> addCorces(Corces corces) {
		 this.corces.add(corces);
		 return this.corces;
	}

	@Override
	public List<Corces> deleteCorces(Corces recivedCorces) throws Exception {
		Corces corce = this.corces.stream().filter(t -> t.getId() == recivedCorces.getId()).findFirst().orElse(null);
		if(corce != null) {
			corces.remove(corce);
		}else {
			throw new IndexOutOfBoundsException();
		}
		return this.corces;
	}

}
