package com.rollingalgo.design.behaviorModel.BluesVisitorPattern;

/**
 * Created by qishoudong on 2017/6/26.
 */

public abstract class BluesBaseEmployee {
    public final static int MALE = 0; //0代表是男性
    public final static int FEMALE = 1; //1代表是女性 //甭管是谁，都有工资
    private String name;
    //只要是员工那就有薪水
    private int salary;
    //性别很重要
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    abstract void accept(BluesIVisitor visitor);
}
