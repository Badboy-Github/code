package com.i.learn.design.structure.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * 安全模式下的树枝
 */
public class Composite implements Component {

    private List<Component> componentList = new ArrayList<>();

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        componentList.remove(component);
    }

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
