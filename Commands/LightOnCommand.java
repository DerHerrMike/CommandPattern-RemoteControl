package com.mps.app.version3.Commands;

import com.mps.app.version3.appliances.AbstractAppliance;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class LightOnCommand implements Command {

    AbstractAppliance lights;

    public LightOnCommand(AbstractAppliance lights) {

        this.lights = lights;
    }

    @Override
    public void execute(AbstractAppliance appliance) {

        lights.on(appliance);
    }
}
