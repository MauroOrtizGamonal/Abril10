package com.softtek.presentacion.ejercicio3;

import com.softtek.modelo.ejercicio3.PasswordValidator;

public class PruebaPasswordValidator {

    public static void main(String[] args) {
        String password1 = "Abcdefg1$";
        String password2 = "Abcdefg1";
        String password3 = "Abcdefgh";

        System.out.println("Contraseña 1 válida: " + PasswordValidator.validatePassword(password1));
        System.out.println("Contraseña 2 válida: " + PasswordValidator.validatePassword(password2));
        System.out.println("Contraseña 3 válida: " + PasswordValidator.validatePassword(password3));
    }
}
