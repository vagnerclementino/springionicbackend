package br.com.springionicbackend.services;

import java.util.List;

import br.com.springionicbackend.domains.Cidade;


public interface CidadeService {
	
	List<Cidade> findAll();
	
	Cidade find(Long id);

}
