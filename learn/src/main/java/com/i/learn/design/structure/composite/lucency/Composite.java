package com.i.learn.design.structure.composite.lucency;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件
 */
public class Composite implements Component {

    private List<Component> componentList = new ArrayList<>();

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return componentList.get(i);
    }

    @Override
    public void operation() {
        for(Component component : componentList){
            component.operation();
        }
    }
}
