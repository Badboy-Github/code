package com.i.learn.design.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator {

    private List<Colleage> colleageList = new ArrayList<>();

    @Override
    public void register(Colleage colleage) {
        if(!colleageList.contains(colleage)){
            colleageList.add(colleage);
            colleage.setMediator(this);
        }
    }

    @Override
    public void relay(Colleage colleage) {
        // 转发消息
        for(Colleage c : colleageList){
            if(c.equals(colleage)){
                c.receive();
            }
        }
    }
}
