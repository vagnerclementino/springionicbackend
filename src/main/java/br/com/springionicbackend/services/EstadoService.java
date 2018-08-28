package br.com.springionicbackend.services;

import java.util.List;

import br.com.springionicbackend.domains.Estado;


public interface EstadoService {
	
	List<Estado> findAll();
	
	Estado find(Long id);

}
