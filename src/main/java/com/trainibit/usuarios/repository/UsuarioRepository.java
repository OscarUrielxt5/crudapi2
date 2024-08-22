package com.trainibit.usuarios.repository;

import com.trainibit.usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUuid(UUID uuid);
    Optional<Usuario> findByNomUsuarioAndPassword(String nomUsuario, String password);
}
