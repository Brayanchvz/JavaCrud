package com.alcid.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alcid.demo.interfaceService.IpersorsonaService;
import com.alcid.demo.interfaces.IPersona;
import com.alcid.demo.modelo.Persona;

@Service
public class PersonaService implements IpersorsonaService{

	@Autowired
	private IPersona data;
	@Override
	public List<Persona> listar() {
		
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Persona p) {
		int res=0;
		Persona persona =data.save(p);
		if(!persona.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}
