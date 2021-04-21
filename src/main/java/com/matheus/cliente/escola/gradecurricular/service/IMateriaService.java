package com.matheus.cliente.escola.gradecurricular.service;

import java.util.List;

import com.matheus.cliente.escola.gradecurricular.entity.MateriaEntity;

public interface IMateriaService {
	
	public List<MateriaEntity> listar();
	
	public MateriaEntity consultar(final Long id);
	
	public Boolean cadastrar(final MateriaEntity materia);
	
	public Boolean atualizar(final MateriaEntity materia);
	
	public Boolean excluir(final Long id);
	


}
