package com.athenas.testeTecnico.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.athenas.testeTecnico.dto.PessoaDTO;
import com.athenas.testeTecnico.model.Pessoa;
import com.athenas.testeTecnico.repository.PessoaRepository;
import com.athenas.testeTecnico.service.PessoaService;

@Component
public class PessoaServiceImpl implements PessoaService{

	@Autowired
	PessoaRepository pessoaRepository;
	
	public PessoaDTO salvar(PessoaDTO pessoaDTO) {
		return new PessoaDTO(pessoaRepository.save(new Pessoa(pessoaDTO)));
	}
	
	public List<PessoaDTO> obterTodasPessoas(){
		return pessoaRepository.findAll()
				.stream()
				.map(p-> new PessoaDTO(p))
				.collect(Collectors.toList());
	}
	
	public List<PessoaDTO> filtrarPessoas(String filtro){
		return pessoaRepository.buscarPessoasPorNomeCpf(filtro)
				.stream()
				.map(p-> new PessoaDTO(p))
				.collect(Collectors.toList());
	}
	
	public PessoaDTO atualizar(PessoaDTO pessoaDTO) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(pessoaDTO.getId());
		if(pessoa.isPresent()) {
			pessoa.orElse(pessoaRepository.save(new Pessoa(pessoaDTO)));
		}
		return new PessoaDTO(pessoa.get());
	}
	
	public void deletar(Long pessoaId) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(pessoaId);
		if(pessoa.isPresent()){
			pessoaRepository.deleteById(pessoaId);
		}
	}
}
