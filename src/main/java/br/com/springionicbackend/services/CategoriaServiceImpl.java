package br.com.springionicbackend.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springionicbackend.domains.Categoria;
import br.com.springionicbackend.repositories.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

	@Override
	public List<Categoria> buscaTodas() {
		
		return repo.findAll();
	}

	@Override
	public Categoria find(Long id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
