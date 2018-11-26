package com.rollingalgo.design.behaviorModel.BluesCommandPattern;

/**
 * Created by qishoudong on 2017/6/22.
 */

public class BluesGroupAddRequestCommand extends BluesGroupInvokerCommand {
    @Override
    public void execute() {
        super.bUI.add();
        super.bCODE.add();
    }
}
