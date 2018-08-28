package br.com.springionicbackend.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springionicbackend.domains.Estado;
import br.com.springionicbackend.repositories.EstadoRepository;

@Service
public class EstadoServiceImpl implements EstadoService {
	
	@Autowired
	private EstadoRepository repo;

	@Override
	public List<Estado> findAll() {
		
		return repo.findAll();
	}

	@Override
	public Estado find(Long id) {
		Optional<Estado> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
