package com.denkitronik.clienteservice2.repositories;

import com.denkitronik.clienteservice2.entities.Cliente;
import com.denkitronik.clienteservice2.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

    @Query("from Region")
    List<Region> findAllRegiones();
}