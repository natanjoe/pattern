package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.exceptions.EspecialidadeException;

public interface IEspecialidades<T>{

	public List<T> listarTodas() throws EspecialidadeException;
	
	public void cadastrar(T especialidade) throws EspecialidadeException;
	
	public void listar(T especialidade) throws EspecialidadeException;
	
	public void editar(T especialidade) throws EspecialidadeException;
	
	public void excluir(T especialidade) throws EspecialidadeException;
	
}
