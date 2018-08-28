package br.com.springionicbackend.services;

import java.util.List;

import br.com.springionicbackend.domains.Produto;


public interface ProdutoService {
	
	List<Produto> findAll();
	
	Produto find(Long id);

}
