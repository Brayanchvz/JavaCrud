package com.alcid.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.alcid.demo.modelo.Persona;

public interface IpersorsonaService {
	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delte(int id);
}
