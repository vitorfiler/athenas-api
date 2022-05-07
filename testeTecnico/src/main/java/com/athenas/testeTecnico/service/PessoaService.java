package com.athenas.testeTecnico.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.athenas.testeTecnico.dto.PessoaDTO;

@Service
public interface PessoaService {

	public PessoaDTO salvar(PessoaDTO pessoaDTO);
	
	public List<PessoaDTO> obterTodasPessoas();
	
	public PessoaDTO atualizar(PessoaDTO pessoaDTO);
	
	public void deletar(Long pessoaId);
	
}
