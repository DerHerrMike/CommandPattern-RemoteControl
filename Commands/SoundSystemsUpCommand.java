package com.mps.app.version3.Commands;

import com.mps.app.version3.appliances.AbstractAppliance;
import com.mps.app.version3.appliances.SoundSystems;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class SoundSystemsUpCommand implements Command {

    AbstractAppliance soundSystems;

    public SoundSystemsUpCommand(AbstractAppliance soundSystems) {

        this.soundSystems = soundSystems;
    }

    @Override
    public void execute(AbstractAppliance appliance) {

        soundSystems.up(appliance);
    }
}
