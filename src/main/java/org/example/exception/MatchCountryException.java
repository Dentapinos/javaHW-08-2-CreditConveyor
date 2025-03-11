package org.example.exception;

public class MatchCountryException extends HandlerException{

    public MatchCountryException(String message, Object errorClass) {
        super(message, errorClass);
    }
}
