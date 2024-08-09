package br.com.arthurcvm.clientes.model.repository;

import br.com.arthurcvm.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
