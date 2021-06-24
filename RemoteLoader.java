package com.mps.app.version3;

import com.mps.app.version3.appliances.AbstractAppliance;
import com.mps.app.version3.appliances.Lights;
import com.mps.app.version3.appliances.SoundSystems;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        AbstractAppliance kitchenLights = new Lights("Kitchen lights");
        AbstractAppliance soundSystems = new SoundSystems("Sound 3000", 4);
        AbstractAppliance livingRoom = new Lights("Living room lights");
        AbstractAppliance stereo = new SoundSystems("Garden Stereo",10);

        remoteControl.setCommand(0,(appliance)-> kitchenLights.on(remoteControl.getAppliance()),(appliance)->kitchenLights.off(remoteControl.getAppliance()),(appliance)-> kitchenLights.up(remoteControl.getAppliance()),(appliance)-> kitchenLights.down(remoteControl.getAppliance()) );

        remoteControl.setCommand(1, (appliance)-> soundSystems.on(remoteControl.getAppliance()),(appliance)-> soundSystems.off(remoteControl.getAppliance()),(appliance)-> soundSystems.up(remoteControl.getAppliance()),(appliance)-> soundSystems.down(remoteControl.getAppliance()));

        remoteControl.setCommand(2,(appliance)->livingRoom.on(remoteControl.getAppliance()),(appliance)-> livingRoom.off(remoteControl.getAppliance()),(appliance)-> livingRoom.up(remoteControl.getAppliance()),((appliance)-> livingRoom.down(remoteControl.getAppliance())));

        remoteControl.setCommand(3,(appliance)->stereo.on(remoteControl.getAppliance()),(appliance)-> stereo.off(remoteControl.getAppliance()),(appliance)-> stereo.up(remoteControl.getAppliance()),(appliance)-> stereo.down(remoteControl.getAppliance()));


        remoteControl.onButtonPushed(0);
        remoteControl.downButtonPushed(0);
        remoteControl.downButtonPushed(0);
        remoteControl.downButtonPushed(0);
        remoteControl.downButtonPushed(0);
        remoteControl.downButtonPushed(0);
        remoteControl.downButtonPushed(0);
        remoteControl.downButtonPushed(0);
        remoteControl.downButtonPushed(0);
        remoteControl.downButtonPushed(0);
        remoteControl.downButtonPushed(0);
        remoteControl.downButtonPushed(0);
        remoteControl.upButtonPushed(0);
        remoteControl.upButtonPushed(0);
        remoteControl.upButtonPushed(0);
        remoteControl.upButtonPushed(0);
        remoteControl.upButtonPushed(0);
        remoteControl.upButtonPushed(0);
        remoteControl.upButtonPushed(0);
        remoteControl.upButtonPushed(0);
        remoteControl.upButtonPushed(0);
        remoteControl.upButtonPushed(0);
        remoteControl.upButtonPushed(0);


        System.out.println();
        remoteControl.onButtonPushed(1);
        remoteControl.downButtonPushed(1);

        remoteControl.downButtonPushed(1);
        remoteControl.upButtonPushed(1);
        remoteControl.offButtonPushed(1);

        System.out.println();
        remoteControl.onButtonPushed(2);
        remoteControl.onButtonPushed(3);
        remoteControl.upButtonPushed(2);
        remoteControl.upButtonPushed(3);
        remoteControl.downButtonPushed(2);
        remoteControl.downButtonPushed(3);
        remoteControl.offButtonPushed(3);
        remoteControl.offButtonPushed(2);
    }


}
