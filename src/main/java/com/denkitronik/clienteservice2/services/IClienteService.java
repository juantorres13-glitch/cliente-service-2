package com.denkitronik.clienteservice2.services;

import com.denkitronik.clienteservice2.entities.Cliente;
import com.denkitronik.clienteservice2.entities.Region;
import java.util.List;
import java.util.Optional;

public interface IClienteService {

    List<Cliente> findAll();

    Optional<Cliente> findById(Long id);

    Cliente save(Cliente cliente);

    Cliente update(Long id, Cliente cliente);

    void delete(Cliente cliente);

    List<Region> findAllRegiones();
}