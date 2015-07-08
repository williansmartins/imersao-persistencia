package br.com.waiso.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="roupa")
public class RoupaEntity implements Serializable{

	private static final long serialVersionUID = -3689382195454890010L;

	@Id @GeneratedValue
	private Integer id;
	private String cor;
	private Double valor;
	private String tecido;
	private String marca;
	private String tamanho;
	private String modelo;
	
	public Integer getId() 
	
	{
		return id;
	}
	public RoupaEntity() {
		super();
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getTecido() {
		return tecido;
	}
	public void setTecido(String tecido) {
		this.tecido = tecido;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
	
	
	