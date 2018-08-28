package br.com.springionicbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springionicbackend.domains.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
