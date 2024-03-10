package com.mgonzalez.encuesta.services;

import com.mgonzalez.encuesta.entities.Registro;
import com.mgonzalez.encuesta.repositories.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroServiceImpl implements RegistroService {

    @Autowired
    private RegistroRepository repository;


    @Override
    public List<Registro> resultado(){
        return (List<Registro>) repository.findAll();
    }

    @Override
    @Transactional
    public Registro guardar(Registro registro) {
        return repository.save(registro);
    }

    @Override
    public Optional<Registro> porEmail(String email) {
        return repository.findByEmail(email);
    }
}
