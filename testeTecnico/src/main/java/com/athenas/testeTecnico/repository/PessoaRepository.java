package com.athenas.testeTecnico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.athenas.testeTecnico.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	@Query(value = "select * from pessoa p where p.nome LIKE %?1% or p.cpf LIKE %?1%" , 
			nativeQuery = true)
	List<Pessoa> buscarPessoasPorNomeCpf(String filtro);
}
