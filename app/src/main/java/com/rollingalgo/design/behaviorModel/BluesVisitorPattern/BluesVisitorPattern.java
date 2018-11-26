package com.rollingalgo.design.behaviorModel.BluesVisitorPattern;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by qishoudong on 2017/6/19.
 * <p>
 * type：行为型 当前：访问模式
 * 经常使用
 * 1命令模式
 * 2观察者模式
 * 3责任链模式
 * 4模板模式
 * 5访问者模式
 * 6状态模式
 * <p>
 * 何时使用:
 * 需要对集合中的对象进行很多不同的并且不相关的操作，而不想修改对象的类，就可以使用访问者模式。
 * <p>
 * 优点:
 * 可以在不改变一个集合中的元素的类的情况下，增加新的施加于该元素上的新操作。
 * <p>
 * 缺点：
 * <p>
 */

public class BluesVisitorPattern {

    public static void main(String args[]) {
//        BluesUserTemple  temple=new BluesUserTemple();
//        temple.allTemple();
        for(BluesBaseEmployee emp:mockEmployee()){
            emp.accept(new BluesVistor());
        }
    }

    public static List<BluesBaseEmployee> mockEmployee() {
        List<BluesBaseEmployee> empList = new ArrayList<BluesBaseEmployee>();
        //产生张三这个员工
        BluesCommonEmployee zhangSan = new BluesCommonEmployee();
        zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(BluesBaseEmployee.MALE);
        empList.add(zhangSan);
        //产生李四这个员工
        BluesCommonEmployee liSi = new BluesCommonEmployee();
        liSi.setJob("页面美工，审美素质太不流行了!");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(BluesBaseEmployee.FEMALE);
        empList.add(liSi);
        //再产生一个经理
        BluesManagerEmployee wangWu = new BluesManagerEmployee();
        wangWu.setName("王五");
        wangWu.setPerformance("基 上是负值，但是我会拍马屁呀");
        wangWu.setSalary(1);
        wangWu.setSex(BluesManagerEmployee.MALE);
        empList.add(wangWu);
        return empList;
    }
}
