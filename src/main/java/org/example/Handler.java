package org.example;

public interface Handler {
    void setNextHandler(Handler handler);
    void handle(Order order) throws HandlerException;
}
