package com.gwc.demo.Prototype;

public class Client {
    private Prototype prototype;
    public Client (Prototype prototype){
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concreatePrototype){
        return (Prototype) concreatePrototype.clone();
    }
}
