package com.jjrockin.labprojectpadroes.spring.services;

import com.jjrockin.labprojectpadroes.spring.entities.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
