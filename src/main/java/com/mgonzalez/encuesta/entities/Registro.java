package com.mgonzalez.encuesta.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name="registro")
public class Registro {
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;
    private String seleccion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }
}
