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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delte(int id) {
		// TODO Auto-generated method stub
		
	}

}
