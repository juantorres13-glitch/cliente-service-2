package com.denkitronik.clienteservice2.repositories;

import com.denkitronik.clienteservice2.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDao extends JpaRepository<Cliente, Long> {
}
