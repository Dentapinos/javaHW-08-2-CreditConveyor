package org.example;

public class HandlerException extends Exception{
    String message;

    public HandlerException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
