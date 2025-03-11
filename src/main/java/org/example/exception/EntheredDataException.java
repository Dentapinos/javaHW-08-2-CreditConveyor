package org.example.exception;

public class EntheredDataException extends HandlerException{

    public EntheredDataException(String message, Object errorClass) {
        super(message, errorClass);
    }
}
