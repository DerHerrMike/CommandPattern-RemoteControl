package com.mps.app.version3;

import com.mps.app.version3.Commands.Command;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command[] upCommands;
    Command[] downCommands;

    public RemoteControl(){
        onCommands = new Command[2];
        offCommands = new Command[2];
        upCommands = new Command[2];
        downCommands = new Command[2];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand, Command upCommand, Command downCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
        upCommands[slot] = upCommand;
        downCommands[slot] = downCommand;
    }

    public void onButtonPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonPushed(int slot){
        offCommands[slot].execute();
    }

    public void upButtonPushed(int slot){
        upCommands[slot].execute();
    }

    public void downButtonPushed(int slot){
        downCommands[slot].execute();
    }



}
