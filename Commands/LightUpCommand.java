package com.mps.app.version3.Commands;

import com.mps.app.version3.appliances.KitchenLights;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class LightUpCommand implements Command {

    KitchenLights lights;

    public LightUpCommand(KitchenLights lights) {

        this.lights = lights;
    }

    @Override
    public void execute() {

        lights.up();
    }
}
