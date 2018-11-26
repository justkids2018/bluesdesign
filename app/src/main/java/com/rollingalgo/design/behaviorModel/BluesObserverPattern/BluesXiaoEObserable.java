package com.rollingalgo.design.behaviorModel.BluesObserverPattern;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by qishoudong on 2017/6/23.
 */

public class BluesXiaoEObserable implements BluesObservable {
    private LinkedHashSet<BluesObserver> observers = new LinkedHashSet<BluesObserver>();

    @Override
    public void addObserver(BluesObserver observer) {
        observers.add(observer);
    }

    @Override
    public void delObserver(BluesObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String info) {
        Iterator<BluesObserver> iterator = observers.iterator();
        while (iterator.hasNext()) {
            iterator.next().update(info);
        }
    }

    public void beginHavDinner() {
        System.out.println("小娥:开始吃饭了...");
        notifyObserver("小娥开始吃晚饭");
    }

    public void beginSleeping() {
        System.out.println("小娥:开始打算睡觉...");
        notifyObserver("小娥打算睡觉");
    }

}
