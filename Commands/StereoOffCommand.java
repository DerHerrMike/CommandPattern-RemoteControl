package com.mps.app.version3.Commands;

import com.mps.app.version3.appliances.Stereo;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {

        this.stereo = stereo;
    }

    @Override
    public void execute() {

        stereo.off();
    }
}
