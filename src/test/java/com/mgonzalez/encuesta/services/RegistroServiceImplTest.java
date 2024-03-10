package com.mgonzalez.encuesta.services;

import com.mgonzalez.encuesta.entities.Registro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RegistroServiceImplTest {

    RegistroService registroService;

    @BeforeEach
    void setUp(){
        registroService = mock(RegistroService.class);
    }

    /*
    *   List<Registro> datosPrueba = Arrays.asList(
                new Registro("test1@gmail.com","Rock"),
                new Registro("test2@gmail.com","Pop"),
                new Registro("test3@gmail.com","Clasica"));
    * */

    @Test
    void testEmailNoExiste() {
        Registro respuesta = new Registro("test2@gmail.com","Rock");
        Optional<Registro> datosPrueba = Optional.of(respuesta);
        when(registroService.porEmail("test2@gmail.com")).thenReturn(datosPrueba);
        Optional<Registro> registroBuscado = registroService.porEmail("test3@gmail.com");

        assertFalse(registroBuscado.isPresent());
    }

    @Test
    void testEmailExiste() {
        Registro respuesta = new Registro("test2@gmail.com","Rock");
        Optional<Registro> datosPrueba = Optional.of(respuesta);
        when(registroService.porEmail("test2@gmail.com")).thenReturn(datosPrueba);
        Optional<Registro> registroBuscado = registroService.porEmail("test2@gmail.com");

        assertTrue(registroBuscado.isPresent());
    }

    @Test
    void testResultado(){
        List<Registro> datosPrueba = Arrays.asList(
                new Registro("test1@gmail.com","Rock"),
                new Registro("test2@gmail.com","Pop"),
                new Registro("test3@gmail.com","Clasica"));
        when(registroService.resultado()).thenReturn(datosPrueba);
        List<Registro> registros = registroService.resultado();

        assertNotNull(registros);
    }






}