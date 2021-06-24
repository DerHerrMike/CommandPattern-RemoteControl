package com.mps.app.version3.Commands;

import com.mps.app.version3.appliances.AbstractAppliance;
import com.mps.app.version3.appliances.SoundSystems;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class SoundSystemsDownCommand implements Command {

    AbstractAppliance soundSystems;

    public SoundSystemsDownCommand(AbstractAppliance soundSystems) {

        this.soundSystems = soundSystems;
    }

    @Override
    public void execute(AbstractAppliance appliance) {

        soundSystems.down(appliance);
    }

}
