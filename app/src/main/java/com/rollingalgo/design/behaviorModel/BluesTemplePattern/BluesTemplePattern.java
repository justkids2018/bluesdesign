package com.rollingalgo.design.behaviorModel.BluesTemplePattern;

import com.rollingalgo.design.behaviorModel.BluesObserverPattern.BluesXiaoEObserable;
import com.rollingalgo.design.behaviorModel.BluesObserverPattern.BluesXiaoWenObserver;
import com.rollingalgo.design.behaviorModel.BluesObserverPattern.BluesZiLinObserver;

/**
 * Created by qishoudong on 2017/6/19.
 * <p>
 * type：行为型 当前：模板模式
 * 经常使用
 * 1命令模式
 * 2观察者模式
 * 3责任链模式
 * 4模板模式
 * 5访问者模式
 * 6状态模式
 * <p>
 * 何时使用:
 * 设计者需要给出一个算法的固定步骤，并将某些步骤的具体实现留给子类来实现。
 *  需要对代码进行重构，将各个子类公共行为提取出来集中到一个共同的父类中以避免代码重复。
 * <p>
 * 优点:
 *  以通过在抽象摸吧能定义模板方法给出成熟的算法步骤，具体模板实现算法细节不会改变整个算法的骨架。
 * <p>
 * 缺点：
 * <p>
 */

public class BluesTemplePattern {

    public static void main(String args[]) {
        BluesUserTemple  temple=new BluesUserTemple();
        temple.allTemple();
    }

}
