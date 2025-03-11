package org.example;

import org.example.exception.HandlerException;

public interface Handler {
    void setNextHandler(Handler handler);
    void handle(Order order) throws HandlerException;
}
