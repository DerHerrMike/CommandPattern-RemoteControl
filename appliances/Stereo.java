package com.mps.app.version3.appliances;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class Stereo {

    String name;
    int volume;
    public static final int MAX_VOLUME =20;
    public static final int MIN_VOLUME =1;

    public Stereo(String name, int volume) {

        this.name = name;
        this.volume = volume;
    }

    public void on() {

        System.out.println(getName()+" on. Volume is now " + getVolume());
    }

    public void off() {

        System.out.println(getName()+" off!");
    }

    public void up() {

        int i = getVolume();
        if (i < MAX_VOLUME) {
            setVolume(getVolume() + 1);
            System.out.println("Volume up from " + i + " to " + getVolume());
        } else System.out.println("Volume already on maximum!");
    }

    public void down() {

        int i = getVolume();
        if (i > MIN_VOLUME) {
            setVolume(getVolume() - 1);
            System.out.println("Volume down from " + i + " to " + getVolume());
        } else if (i==MIN_VOLUME){
            setVolume(getVolume() - 1);
            System.out.println(getName()+" muted!");
        } else System.out.println(getName()+" already on mute!");
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int volume) {

        this.volume = volume;
    }
}
