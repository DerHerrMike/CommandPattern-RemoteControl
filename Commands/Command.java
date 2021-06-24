package com.mps.app.version3.Commands;

import com.mps.app.version3.appliances.AbstractAppliance;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public interface Command {

    void execute(AbstractAppliance appliance);

}
