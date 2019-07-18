package me.antinux.web.rest.errors;

public class AccessDeniedException extends Exception {

    public AccessDeniedException(String message) {
        super(message);
    }

}
