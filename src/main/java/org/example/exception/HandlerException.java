package org.example.exception;


import lombok.Getter;

public class HandlerException extends Exception{
    String message;
    @Getter
    String nameErrorClass;

    public HandlerException(String message, Object errorClass) {
        this.message = message;
        this.nameErrorClass = errorClass.getClass().getName();
    }

    @Override
    public String getMessage() {
        return message;
    }

}
