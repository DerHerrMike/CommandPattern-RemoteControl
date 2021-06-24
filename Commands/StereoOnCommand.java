package com.mps.app.version3.Commands;

import com.mps.app.version3.appliances.Stereo;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class StereoOnCommand implements Command {

    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {

        this.stereo = stereo;
    }

    @Override
    public void execute() {

        stereo.on();
    }
}
