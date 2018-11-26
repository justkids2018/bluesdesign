package com.rollingalgo.design.structureModel.BluesBridgePattern;


import com.rollingalgo.design.structureModel.BluesProxyPattern.BluesProxyTargetObject;

/**
 * Created by qishoudong on 2017/6/19.
 * <p>
 * currentType：桥接模式
 * 将抽象部分与它的实现部分分离，使它们都可以独立的变化
 * <p>
 * type：结构型  经常使用，
 * <p>
 * 何时使用：
 * 1不想让抽象和某些重要的实现代码是固定的绑定关系，这部分实现可运行时动态决定。
 * 2抽象和实现者都可以继承当方式独立地扩充而互不影响，程序在运行期间可能需要动态的将一个抽象的子类的实例与一个实现者的子类的实例进行组合。
 * <p>
 * 优点：
 * 桥接模式分离实现与抽象，使抽象可实现可以独立的扩展。当修改实现的代码时，不影响抽象的代码，反之也一样。
 * <p>
 *         桥接模式是一种结构型模式，
 *         它主要应对的是：由于实际的需要，某个类具有两个或两个以上的维度变化，如果只是用继承将无法实现这种需要，或者使得设计变得相当臃肿。
 * <p>
 * <p>
 * 缺点：
 * <p>
 *  桥接模式中有4种角色：
 抽象
 细化抽象
 实现者
 具体实现者
 * <p>
 */


public class BluesBridgePattern {


    public static void main(String args[]) {
        BluesBridgeSaveFile saveFile=new BluesBridgeSaveFile();
        BluesBridgeSaveToDB saveToDB=new BluesBridgeSaveToDB();
        BluesBridgeLocalData  localData=new BluesBridgeLocalData(saveFile);
        localData.save("测试本地的数据");
        BluesBridgeNetData  netData=new BluesBridgeNetData(saveToDB);
        netData.save("网络数据");
    }

}
