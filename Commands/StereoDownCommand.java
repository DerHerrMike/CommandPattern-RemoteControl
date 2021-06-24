package com.mps.app.version3.Commands;

import com.mps.app.version3.appliances.Stereo;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class StereoDownCommand implements Command {

    Stereo stereo;

    public StereoDownCommand(Stereo stereo) {

        this.stereo = stereo;
    }

    @Override
    public void execute() {

        stereo.down();
    }

}
