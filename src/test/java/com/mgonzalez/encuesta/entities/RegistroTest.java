package com.mgonzalez.encuesta.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {
    @Test
    void testEmailGetterAndSetter() {
        String expectedEmail = "test1@gmail.com";
        Registro registro = new Registro();
        registro.setEmail(expectedEmail);

        assertEquals(expectedEmail, registro.getEmail());
    }

    @Test
    void testSeleccionGetterAndSetter() {
        String expectedSeleccion = "Pop";
        Registro registro = new Registro();
        registro.setSeleccion(expectedSeleccion);

        assertEquals(expectedSeleccion, registro.getSeleccion());
    }

    @Test
    void testIdSetter() {
        Long expectedId = 42L;
        Registro registro = new Registro();
        registro.setId(expectedId);

        assertEquals(expectedId, registro.getId());
    }
}