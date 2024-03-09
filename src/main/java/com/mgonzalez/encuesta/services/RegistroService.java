package com.mgonzalez.encuesta.services;

import com.mgonzalez.encuesta.entities.Registro;

import java.util.List;
import java.util.Optional;

public interface RegistroService {

    List<Registro> resultado();
    Registro guardar(Registro registro);

    Optional<Registro> porEmail(String email);
}
