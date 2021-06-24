package com.mps.app.version3;

import com.mps.app.version3.Commands.Command;
import com.mps.app.version3.appliances.AbstractAppliance;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command[] upCommands;
    Command[] downCommands;
    AbstractAppliance appliance;

    public RemoteControl(){
        onCommands = new Command[4];
        offCommands = new Command[4];
        upCommands = new Command[4];
        downCommands = new Command[4];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand, Command upCommand, Command downCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
        upCommands[slot] = upCommand;
        downCommands[slot] = downCommand;
    }

    public void onButtonPushed(int slot){
        onCommands[slot].execute( getAppliance());
    }

    public void offButtonPushed(int slot){
        offCommands[slot].execute(getAppliance());
    }

    public void upButtonPushed(int slot){
        upCommands[slot].execute(getAppliance());
    }

    public void downButtonPushed(int slot){
        downCommands[slot].execute(getAppliance());
    }

    public AbstractAppliance getAppliance() {

        return appliance;
    }
}
