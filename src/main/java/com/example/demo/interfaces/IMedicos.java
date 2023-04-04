package com.example.demo.interfaces;

import java.util.List;

public interface IMedicos<T> {

	
	public List<T> listarTodas();
	
	public void cadastrar(T medicoDao);
	
	public void listar(T medicoDao);
	
	public void editar(T medicoDao);
	
	public void excluir(T medicoDao);
	
}
