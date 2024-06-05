package com.generation.jornadalimpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.jornadalimpa.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByEmail(String email);
	
	public Usuario findByNomeContainingIgnoreCase(@Param("nome") String nome);
	
}
