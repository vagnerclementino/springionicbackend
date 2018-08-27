package br.com.springionicbackend.services;

import java.util.List;

import br.com.springionicbackend.domains.Categoria;


public interface CategoriaService {
	
	List<Categoria> buscaTodas();
	
	Categoria find(Long id);

}
