/**
 * 
 */
package com.example.demo.entity;

import jakarta.persistence.Entity;

/**
 * @author Samuel Rollemberg
 *
 */

@Entity
public class Especialidade {

	private int id;
	private String Nome;
	private String Descricao;
	private String Ativo;

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
		return Nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		Nome = nome;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return Descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	/**
	 * @return the ativo
	 */
	public String getAtivo() {
		return Ativo;
	}

	/**
	 * @param ativo the ativo to set
	 */
	public void setAtivo(String ativo) {
		Ativo = ativo;
	}

}
