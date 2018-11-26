package com.rollingalgo.design.behaviorModel.BluesCommandPattern;

/**
 * Created by qishoudong on 2017/6/22.
 */

public class BluesGroupInvoker {

    private BluesGroupInvokerCommand mCommand;

    public void setCommand(BluesGroupInvokerCommand command) {
        mCommand = command;
    }

    public void action() {
        if (mCommand != null) {
            mCommand.execute();
        }
    }


}
