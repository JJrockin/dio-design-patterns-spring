package com.jjrockin.labprojectpadroes.spring.repositories;

import com.jjrockin.labprojectpadroes.spring.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
