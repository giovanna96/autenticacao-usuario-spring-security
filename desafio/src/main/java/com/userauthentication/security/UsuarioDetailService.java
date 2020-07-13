package com.userauthentication.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.userauthentication.models.MyUserDetails;
import com.userauthentication.models.Usuario;
import com.userauthentication.repository.UsuarioRepository;

/**
 * Classe que determina autenticação de usuários
 * @author Giovanna Severo
 *
 */
@Service
public class UsuarioDetailService implements UserDetailsService{
	@Autowired
	UsuarioRepository usuarioRepository;
	
	/**
	 * Método que valida a existência do usuário no banco
	 */
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Optional<Usuario> usuario = usuarioRepository.findByLogin(login);
		
		usuario.orElseThrow(() -> new BadCredentialsException("User not found"));
		
		return usuario.map(MyUserDetails::new).get();
	}

}
