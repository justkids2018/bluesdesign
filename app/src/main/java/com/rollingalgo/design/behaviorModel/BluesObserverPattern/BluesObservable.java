package com.rollingalgo.design.behaviorModel.BluesObserverPattern;

/**
 * Created by qishoudong on 2017/6/23.
 * 被观察者
 */

public interface BluesObservable {

    public void addObserver(BluesObserver observable);

    public void delObserver(BluesObserver observable);

    public void notifyObserver(String json);

}
