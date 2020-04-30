package com.i.learn.design.behavior.mediator;

/**
 * 同事类
 */
public abstract class Colleage {

    protected Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void receive();

    abstract void send(Colleage colleage);
}
