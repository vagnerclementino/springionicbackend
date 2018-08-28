package br.com.springionicbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springionicbackend.domains.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {

}
