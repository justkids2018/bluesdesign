package com.rollingalgo.design.behaviorModel.BluesObserverPattern;

import com.rollingalgo.design.behaviorModel.BluesResponsibilityPattern.BluesFather;
import com.rollingalgo.design.behaviorModel.BluesResponsibilityPattern.BluesHandler;
import com.rollingalgo.design.behaviorModel.BluesResponsibilityPattern.BluesHusband;
import com.rollingalgo.design.behaviorModel.BluesResponsibilityPattern.BluesIWomen;
import com.rollingalgo.design.behaviorModel.BluesResponsibilityPattern.BluesSun;
import com.rollingalgo.design.behaviorModel.BluesResponsibilityPattern.BluesWomen;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by qishoudong on 2017/6/19.
 * <p>
 * type：行为型 当前：观察者模式
 * 经常使用
 * 1命令模式
 * 2观察者模式
 * 3责任链模式
 * 4模板模式
 * 5访问者模式
 * 6状态模式
 * <p>
 * 何时使用:
 * 当一个对象的数据更新时，需要通知其他对象，而又不希望和被通知的对象形成紧耦合时
 * <p>
 * 优点:
 * <p>
 * 缺点：
 * <p>
 */

public class BluesObserverPattern {


    public static void main(String args[]) {

        BluesZiLinObserver ziLinObserver = new BluesZiLinObserver();
        BluesXiaoWenObserver xiaoWenObserver = new BluesXiaoWenObserver();

        BluesXiaoEObserable xiaoEObserable = new BluesXiaoEObserable();
        xiaoEObserable.addObserver(ziLinObserver);
        xiaoEObserable.addObserver(xiaoWenObserver);
//        xiaoEObserable.beginHavDinner();
        xiaoEObserable.beginSleeping();

    }

}
