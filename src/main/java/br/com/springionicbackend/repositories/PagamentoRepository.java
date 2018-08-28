package br.com.springionicbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springionicbackend.domains.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento,Long> {

}
