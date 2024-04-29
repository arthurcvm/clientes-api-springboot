package br.com.arthurcvm.clientes.model.repository;

import br.com.arthurcvm.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
