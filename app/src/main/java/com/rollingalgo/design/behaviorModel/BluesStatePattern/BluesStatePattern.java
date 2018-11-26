package com.rollingalgo.design.behaviorModel.BluesStatePattern;


import com.rollingalgo.design.behaviorModel.BluesVisitorPattern.BluesBaseEmployee;
import com.rollingalgo.design.behaviorModel.BluesVisitorPattern.BluesCommonEmployee;
import com.rollingalgo.design.behaviorModel.BluesVisitorPattern.BluesManagerEmployee;
import com.rollingalgo.design.behaviorModel.BluesVisitorPattern.BluesVistor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qishoudong on 2017/6/19.
 * <p>
 * type：行为型 当前：状态模式  （和策略模式很相似，就不详细些策略模式了）
 * 经常使用
 * 1命令模式
 * 2观察者模式
 * 3责任链模式
 * 4模板模式
 * 5访问者模式
 * 6状态模式
 * <p>
 * 何时使用:
 * 一个对象的行为依赖于它的状态，并且它必须在运行时根据状态改变它的行为 。
 * <p>
 * <p>
 * 优点:
 *  使用一个类封装对象的一种状态，很容易增加新的状态
 *  在状态模式中，环境（Context）中不必出现大量的条件判断语句。
 * <p>
 * <p>
 * 缺点：
 * <p>
 */

public class BluesStatePattern {

    public static void main(String args[]) {
            BluesContext context=new BluesContext();
            context.setLiftState(new BluesOpenState());
            context.open();
            context.close();
            context.run();
    }


}
