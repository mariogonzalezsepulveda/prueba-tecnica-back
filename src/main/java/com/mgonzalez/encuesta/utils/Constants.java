package com.mgonzalez.encuesta.utils;

public class Constants {
    public final static String REGEX_EMAIL = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
    public final static String ERROR_EMAIL_EXISTE = "Error correo ya se encuentra registrado";
    public final static String MENSAJE_EXITO = "Su registro fue guardado";
    public final static String ERROR_EMAIL_FORMATO = "Error en formato de correo, debe ser aaaaa@dominio.cl";
    public final static String MESSAGE = "mensaje";
}
