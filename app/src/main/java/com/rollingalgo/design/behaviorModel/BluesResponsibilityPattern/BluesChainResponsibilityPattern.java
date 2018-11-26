package com.rollingalgo.design.behaviorModel.BluesResponsibilityPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by qishoudong on 2017/6/19.
 *
 * type：行为型
 * 经常使用
 * 1命令模式
 * 2观察者模式
 * 3状态模式
 * 4模板模式
 * 5访问者模式
 * 6责任链模式
 * 责任链模式pattern
 * <p>
 * <p>
 * <p>
 * 使很多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 * 何时使用
 * 有许多对象可以处理用户请求，希望程序在运行期间自动确定处理用户的那个对象。
 * 希望用户不必明确指定接收者的情况下，想多个接受者的一个提交请求
 * 程序希望动态的指定可处理用户请求的对象集合
 * 优点
 * <p>
 * 低耦合
 * 可以动态的添加删除处理者或重新指派处理者的职责
 * 可以动态改变处理者之间的先后顺序
 *
 *
 */

public class BluesChainResponsibilityPattern {


    public static void main(String args[]) {
        System.out.println("--------");

        //随机挑选几个女性
        Random rand = new Random();
        ArrayList<BluesIWomen> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new BluesWomen(rand.nextInt(4), "我要出去逛街"));
        }
        //定义三个请示对象
        BluesHandler father = new BluesFather();
        BluesHandler husband = new BluesHusband();
        BluesHandler sun = new BluesSun();
        father.setNext(husband);
        husband.setNext(sun);
        for (BluesIWomen women : arrayList) {
            father.HandlerMessage(women);
        }
    }

}
