package br.com.springionicbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springionicbackend.domains.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

}
