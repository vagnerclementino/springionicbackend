package br.com.springionicbackend.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springionicbackend.domains.Cidade;
import br.com.springionicbackend.repositories.CidadeRepository;

@Service
public class CidadeServiceImpl implements CidadeService {
	
	@Autowired
	private CidadeRepository repo;

	@Override
	public List<Cidade> findAll() {
		
		return repo.findAll();
	}

	@Override
	public Cidade find(Long id) {
		Optional<Cidade> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
