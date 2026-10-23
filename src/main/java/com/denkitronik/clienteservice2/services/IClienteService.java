package com.denkitronik.clienteservice2.services;

import com.denkitronik.clienteservice2.entities.Cliente;
import java.util.List;

public interface IClienteService {
    List<Cliente> findAll();
    Cliente findById(Long id);
    Cliente save(Cliente cliente);
    void delete(Long id);
}