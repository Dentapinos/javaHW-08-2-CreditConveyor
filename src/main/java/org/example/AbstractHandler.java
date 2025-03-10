package org.example;

public abstract class AbstractHandler implements Handler {
    Handler handler;

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
}
