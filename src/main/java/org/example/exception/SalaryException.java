package org.example.exception;

public class SalaryException extends HandlerException{

    public SalaryException(String message, Object errorClass) {
        super(message, errorClass);
    }
}
