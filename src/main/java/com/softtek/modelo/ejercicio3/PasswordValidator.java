package com.softtek.modelo.ejercicio3;

import java.util.function.Function;

public class PasswordValidator {

    public static boolean validatePassword(String password) {

        Function<String, Boolean> lengthValidator = str -> str.length() >= 8;
        Function<String, Boolean> uppercaseValidator = str -> str.chars().anyMatch(Character::isUpperCase);
        Function<String, Boolean> lowercaseValidator = str -> str.chars().anyMatch(Character::isLowerCase);
        Function<String, Boolean> digitValidator = str -> str.chars().anyMatch(Character::isDigit);
        Function<String, Boolean> specialCharValidator = str -> str.chars().anyMatch(ch -> "!@#$%^&*()-+".indexOf(ch) != -1);


        Function<String, Boolean> passwordValidator = passwordToCheck ->
                lengthValidator.apply(passwordToCheck) &&
                        uppercaseValidator.apply(passwordToCheck) &&
                        lowercaseValidator.apply(passwordToCheck) &&
                        digitValidator.apply(passwordToCheck) &&
                        specialCharValidator.apply(passwordToCheck);


        return passwordValidator.apply(password);
    }
}
