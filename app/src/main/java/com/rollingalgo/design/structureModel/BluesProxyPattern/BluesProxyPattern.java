package com.rollingalgo.design.structureModel.BluesProxyPattern;


import com.rollingalgo.design.structureModel.BluesAdapterPattern.BluesClassAdapter;
import com.rollingalgo.design.structureModel.BluesAdapterPattern.BluesTarget;

/**
 * Created by qishoudong on 2017/6/19.
 * <p>
 * currentType：代理模式
 * <p>
 * type：结构型  经常使用，
 * <p>
 * <p>
 * <p>
 * 何时使用：
 * 程序可能不希望用户直接访问该对象，而是提供一个特殊的对象以控制对当前对象的访问。
 * 如果一个对象（例如很大的图像）需要很长时间才能完成加载。
 * 如果对象位于远程主机上，需要为用户提供访问该远程对象的能力。
 * <p>
 * 优点：

 * <p>
 * <p>
 * 缺点：
 * <p>
 * <p>
 */


public class BluesProxyPattern {


    public static void main(String args[]) {
        BluesProxyTargetObject object = new BluesProxyTargetObject();
        object.method2();
    }

}
