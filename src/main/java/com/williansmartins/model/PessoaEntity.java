package com.williansmartins.model;

import java.io.Serializable;


public class PessoaEntity implements Serializable{

	private static final long serialVersionUID = -3689382195454890010L;

	private Integer id;
	private String nome;
	private Integer idade;
	private char sexo;
	
	public PessoaEntity(){
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
}
