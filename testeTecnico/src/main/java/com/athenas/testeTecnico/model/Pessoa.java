package com.athenas.testeTecnico.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.athenas.testeTecnico.dto.PessoaDTO;

@Entity(name="Pessoa")
@Table
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="Nome")
	private String nome;
	
	@Column(name="Data_Nasc")
	private String dtNasc;
	
	@Column(name="CPF")
	private String cpf;
	
	@Column(name="Sexo")
	private String sexo;
	
	@Column(name="Altura")
	private Double altura;
	
	@Column(name="Peso")
	private Double peso;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
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
	 * @return the dtNasc
	 */
	public String getDtNasc() {
		return dtNasc;
	}

	/**
	 * @param dtNasc the dtNasc to set
	 */
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the altura
	 */
	public Double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(Double altura) {
		this.altura = altura;
	}

	/**
	 * @return the peso
	 */
	public Double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Pessoa() {
		super();
	}
	
	public Pessoa(PessoaDTO pessoaDTO) {
		this.id = pessoaDTO.getId();
		this.nome = pessoaDTO.getNome();
		this.dtNasc = pessoaDTO.getDtNasc();
		this.cpf = pessoaDTO.getCpf();
		this.sexo = pessoaDTO.getSexo();
		this.altura = pessoaDTO.getAltura();
		this.peso = pessoaDTO.getPeso();
	}
}
