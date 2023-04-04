/**
 * 
 */
package com.example.demo.implementation;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.demo.entity.Medico;
import com.example.demo.exceptions.EspecialidadeException;

/**
 * @author Samuel Rollemberg
 *
 */
class EspecialidadesImplTest {

	
	@Test
	void listarTodas() {
		
		Medico medico = new Medico();
		medico.setId(0);
		medico.setNome(null);
		medico.setDataNascimento(null);
		medico.setEspecialidadeDao(null);
		
	
	}
	
	/*
	 * void cadastrar(T especialidade) throws EspecialidadeException;
	 * 
	 * void listar(T especialidade) throws EspecialidadeException;
	 * 
	 * void editar(T especialidade) throws EspecialidadeException;
	 * 
	 * void excluir(T especialidade) throws EspecialidadeException;
	 */
	
	
}
