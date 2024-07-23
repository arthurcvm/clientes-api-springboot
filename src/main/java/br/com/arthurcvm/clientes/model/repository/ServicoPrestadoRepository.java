package br.com.arthurcvm.clientes.model.repository;

import br.com.arthurcvm.clientes.model.entity.ServicoPrestado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoPrestadoRepository extends JpaRepository<ServicoPrestado, Integer> {
}
