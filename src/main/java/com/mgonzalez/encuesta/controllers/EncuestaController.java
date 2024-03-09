package com.mgonzalez.encuesta.controllers;

import com.mgonzalez.encuesta.entities.Registro;
import com.mgonzalez.encuesta.services.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import static com.mgonzalez.encuesta.utils.Constants.*;

@RestController
public class EncuestaController {

    @Autowired
    private RegistroService registroService;

    @GetMapping
    public List<Registro> resultado(){
        return registroService.resultado();
    }

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Registro registro){
        if(validaFormatoEmail(registro.getEmail())) {
            if (!registroService.porEmail(registro.getEmail()).isPresent()) {
                registroService.guardar(registro);
                return ResponseEntity.status(HttpStatus.CREATED)
                        .body(Collections.singletonMap(MESSAGE, MENSAJE_EXITO));
            }
            return ResponseEntity.badRequest().body(Collections.singletonMap(MESSAGE,ERROR_EMAIL_EXISTE));
        }
        return ResponseEntity.badRequest().body(Collections.singletonMap(MESSAGE,ERROR_EMAIL_FORMATO));
    }

    public Boolean validaFormatoEmail(String email) {
        if(Pattern.matches(REGEX_EMAIL,email)){
            return true;
        };
        return false;
    }
}
