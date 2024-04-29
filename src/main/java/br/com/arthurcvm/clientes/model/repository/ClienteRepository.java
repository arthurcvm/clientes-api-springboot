package br.com.arthurcvm.clientes.model.repository;

import br.com.arthurcvm.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
