package com.rollingalgo.design.structureModel.BluesDecoratePattern;


import com.rollingalgo.design.structureModel.BluesAdapterPattern.BluesClassAdapter;
import com.rollingalgo.design.structureModel.BluesAdapterPattern.BluesTarget;

/**
 * Created by qishoudong on 2017/6/19.
 * <p>
 * currentType：装饰模式
 * <p>
 * type：结构型  经常使用，
 * <p>
 * 动态的给对象添加额外的职责。就功能来说，装饰模式比生产子类更为灵活。
 * <p>
 * <p>
 * 何时使用：
 * 程序希望动态的增强类的某对对象的功能，而不影响其他对象时
 * 采用继承来增强对象功能不利于系统的扩展和维护时
 * <p>
 * 优点：
 * 满足开-闭原则
 * 可以使用多个具体装饰器装饰具体组件的实例
 * <p>
 * <p>
 * 缺点：
 * <p>
 * <p>
 */


public class BluesDecoratePattern {


    public static void main(String args[]) {
        //初始
        String data = "==数据";
        BluesPreInterface bluesPreInterface = new BluesPreImp();
        bluesPreInterface.persistentMsg(data);
        //装饰
        System.out.println("下面装饰数据库持久化：========");
        bluesPreInterface=new BluesDecoratorPreDBDetail(bluesPreInterface);
        bluesPreInterface.persistentMsg(data);
        System.out.println("下面装饰网络：-----------");
        bluesPreInterface=new BluesDecoratorPreNetDetail(bluesPreInterface);
        bluesPreInterface.persistentMsg(data);
    }

}
