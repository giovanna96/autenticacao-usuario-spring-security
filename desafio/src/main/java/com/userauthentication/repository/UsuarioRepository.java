package com.userauthentication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userauthentication.models.Usuario;
 /**
  * 
  * @author Giovanna Severo
  *
  */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Optional<Usuario> findByLogin(String login);
}
