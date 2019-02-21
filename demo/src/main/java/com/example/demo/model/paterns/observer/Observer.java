package com.example.demo.model.paterns.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
