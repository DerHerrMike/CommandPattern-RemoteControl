package com.mps.app.version3.Commands;

import com.mps.app.version3.appliances.AbstractAppliance;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class LightOffCommand implements Command {

    AbstractAppliance lights;

    public LightOffCommand(AbstractAppliance lights) {

        this.lights = lights;
    }

    @Override
    public void execute(AbstractAppliance appliance) {

        lights.off(appliance);
    }

}
