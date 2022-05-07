package com.athenas.testeTecnico.dto;

import com.athenas.testeTecnico.model.Pessoa;

public class PessoaDTO {

	private Long id;
	
	private String nome;
	
	private String dtNasc;
	
	private String cpf;
	
	private String sexo;
	
	private Double altura;
	
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
	public PessoaDTO() {
		super();
	}
	
	public PessoaDTO(Pessoa pessoa) {
		this.id = pessoa.getId();
		this.nome = pessoa.getNome();
		this.dtNasc = pessoa.getDtNasc();
		this.cpf = pessoa.getCpf();
		this.sexo = pessoa.getSexo();
		this.altura = pessoa.getAltura();
		this.peso = pessoa.getPeso();
	}
}
