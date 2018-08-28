package br.com.springionicbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springionicbackend.domains.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {

}
