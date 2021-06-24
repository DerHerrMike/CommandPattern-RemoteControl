package com.mps.app.version3.appliances;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public abstract class AbstractAppliance {

    String name;
    public abstract void on(AbstractAppliance name);
    public abstract void off(AbstractAppliance name);
    public abstract void up(AbstractAppliance name);
    public abstract void down(AbstractAppliance name);

}
