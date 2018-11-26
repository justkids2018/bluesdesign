package com.rollingalgo.design.behaviorModel.BluesCommandPattern;

/**
 * Created by qishoudong on 2017/6/22.
 */

public class BluesGroupDelFunCommand extends BluesGroupInvokerCommand {
    @Override
    public void execute() {
        super.bUI.del();
        super.bCODE.del();
    }
}
