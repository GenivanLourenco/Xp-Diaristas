package io.github.xpdiaristas.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.xpdiaristas.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
