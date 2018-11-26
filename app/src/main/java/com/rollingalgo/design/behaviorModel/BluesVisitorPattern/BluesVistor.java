package com.rollingalgo.design.behaviorModel.BluesVisitorPattern;

/**
 * Created by qishoudong on 2017/6/26.
 */

public class BluesVistor implements BluesIVisitor {

    @Override
    public void visit(BluesCommonEmployee commonEmployee) {
        System.out.println("---BluesCommonEmployee---"+getCommonInfo(commonEmployee));
    }

    @Override
    public void visit(BluesManagerEmployee managerEmployee) {
        System.out.println("---BluesManagerEmployee---"+getManagerInfo(managerEmployee));

    }

    private String getBaseInfo(BluesBaseEmployee baseEmployee) {
        String info = "";
        if (baseEmployee != null) {
            info = "姓名:" + baseEmployee.getName() + "\t";
            info = info + "性别:" + baseEmployee.getSex() + "\t";
            info = info + "薪水:" + baseEmployee.getSalary() + "\t";
        }
        return info;
    }

    private String getCommonInfo(BluesCommonEmployee commonEmployee) {
        String baseInfo = getBaseInfo(commonEmployee);
        String otherInfo = "工作:" + commonEmployee.getJob() + "\t";
        return baseInfo + otherInfo;
    }

    private String getManagerInfo(BluesManagerEmployee managerEmployee) {
        String baseInfo = getBaseInfo(managerEmployee);
        String otherInfo = "业绩:" + managerEmployee.getPerformance() + "\t";
        return baseInfo + otherInfo;
    }

}
