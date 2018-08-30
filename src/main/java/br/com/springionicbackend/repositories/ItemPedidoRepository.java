package br.com.springionicbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springionicbackend.domains.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido,Long> {

}
