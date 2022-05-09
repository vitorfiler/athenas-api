package com.athenas.testeTecnico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.athenas.testeTecnico.dto.PessoaDTO;
import com.athenas.testeTecnico.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	PessoaService pessoaService;
	
	@PostMapping
	public PessoaDTO salvar(@RequestBody PessoaDTO pessoaDTO) {
		return pessoaService.salvar(pessoaDTO);
	}
	
	@GetMapping
	public List<PessoaDTO> obterTodasPessoas(){
		return pessoaService.obterTodasPessoas();
	}
	
	@GetMapping("/filtro")
	public List<PessoaDTO> filtrarPessoas(@RequestParam(value="filtro") String filtro){
		return pessoaService.filtrarPessoas(filtro);
	}
	
	@PutMapping
	public PessoaDTO atualizar(@RequestBody PessoaDTO pessoaDTO) {
		return pessoaService.atualizar(pessoaDTO);
	}
	
	@DeleteMapping
	public void deletar(@RequestParam(value="pessoa_id") Long pessoaId) {
		pessoaService.deletar(pessoaId);
	}
}
