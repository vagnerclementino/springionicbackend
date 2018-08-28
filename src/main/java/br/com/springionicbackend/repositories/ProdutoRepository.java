package br.com.springionicbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springionicbackend.domains.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

}
