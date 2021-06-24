package com.mps.app.version3;

import com.mps.app.version3.appliances.KitchenLights;
import com.mps.app.version3.appliances.Stereo;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        KitchenLights kitchenLights = new KitchenLights("Kitchen lights");
        Stereo stereo = new Stereo("Sound 3000",2);

        remoteControl.setCommand(0,()-> kitchenLights.on(),()->kitchenLights.off(),()-> kitchenLights.up(),()-> kitchenLights.down() );

        remoteControl.setCommand(1, ()-> stereo.on(),()-> stereo.off(),()-> stereo.up(),()-> stereo.down());

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
    }


}
