/**
 * 
 */
package com.example.demo.entity;

import java.sql.Date;

/**
 * @author Samuel Rollemberg
 */
public class Medico {
	
	private int id;
	private String nome;
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the especialidadeDao
	 */
	public Especialidade getEspecialidadeDao() {
		return especialidadeDao;
	}

	/**
	 * @param especialidadeDao the especialidadeDao to set
	 */
	public void setEspecialidadeDao(Especialidade especialidadeDao) {
		this.especialidadeDao = especialidadeDao;
	}

	Date dataNascimento;
	Especialidade especialidadeDao;
}
