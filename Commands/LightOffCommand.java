package com.mps.app.version3.Commands;

import com.mps.app.version3.appliances.KitchenLights;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class LightOffCommand implements Command {

    KitchenLights lights;

    public LightOffCommand(KitchenLights lights) {

        this.lights = lights;
    }

    @Override
    public void execute() {

        lights.off();
    }
}
