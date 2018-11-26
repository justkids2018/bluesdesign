package com.rollingalgo.design.behaviorModel.BluesCommandPattern;


/**
 * type：行为型  经常使用
 * 1命令模式
 * 2观察者模式
 * 3状态模式
 * 4模板模式
 * 5访问者模式
 * 6责任链模式
 * <p>
 * Created by qishoudong on 2017/6/19.
 * <p>
 * 命令模式
 * <p>
 * 优点：
 * 1、在命令模式中，请求者（Invoker）不直接与接受者（Receiver）交互，及请求者（Invoker）不包含接受者（Receiver）的引用，
 * 因此彻底消除了彼此间的耦合。
 * 2、符合开闭原则
 * <p>
 * 缺点：
 * 命令模式不宜滥用，比如：使用这种模式，会多出来很多对象（命令）。
 * <p>
 */

public class BluesCommandPattern {


    public static void main(String args[]) {
        BluesGroupInvoker invoker = new BluesGroupInvoker();
//            BluesGroupAddRequestCommand addRequestCommand=new BluesGroupAddRequestCommand();
        BluesGroupDelFunCommand delRequestCommand = new BluesGroupDelFunCommand();
        invoker.setCommand(delRequestCommand);
        invoker.action();
    }

}
