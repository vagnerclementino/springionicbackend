package br.com.springionicbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springionicbackend.domains.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade,Long> {

}
