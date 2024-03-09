package com.mgonzalez.encuesta.repositories;

import com.mgonzalez.encuesta.entities.Registro;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RegistroRepository extends CrudRepository<Registro,Long> {
    Optional<Registro> findByEmail(String email);
}
