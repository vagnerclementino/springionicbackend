package br.com.springionicbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springionicbackend.domains.Estado;

public interface EstadoRepository extends JpaRepository<Estado,Long> {

}
