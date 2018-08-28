package br.com.springionicbackend.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springionicbackend.domains.Produto;
import br.com.springionicbackend.repositories.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	
	@Autowired
	private ProdutoRepository repo;

	@Override
	public List<Produto> findAll() {
		
		return repo.findAll();
	}

	@Override
	public Produto find(Long id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
