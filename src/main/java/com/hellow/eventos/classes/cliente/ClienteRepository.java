package com.hellow.eventos.classes.cliente;

import com.hellow.eventos.classes.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
