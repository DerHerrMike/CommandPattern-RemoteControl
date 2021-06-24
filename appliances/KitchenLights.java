package com.mps.app.version3.appliances;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class KitchenLights {

    String name;
    int brightness;
    public static final int MAX_LIGHTS = 100;
    public static final int MIN_LIGHTS = 10;

    public KitchenLights(String name) {

        this.name = name;

    }

    public void on() {
        setBrightness(100);
        System.out.println("Light is now on. Brightness set to "+getBrightness()+"%");
    }


    public void off() {
        setBrightness(0);
        System.out.println("Light is now off");
    }


    public void up() {
        int i = getBrightness();
        if(i<MAX_LIGHTS){
            setBrightness(getBrightness()+10);
            System.out.println("Brightness increased from "+i+" to "+getBrightness());
        } else System.out.println("Brightness already 100%");
    }


    public void down() {

        int i = getBrightness();
        if(i>MIN_LIGHTS){
            setBrightness(getBrightness()-10);
            System.out.println("Brightness reduced from "+i+" to "+getBrightness());
        }else if (i==MIN_LIGHTS){
            System.out.println("Lights already on minimum brightness of 10%");
        } else System.out.println("Lights dark");
    }



    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getBrightness() {

        return brightness;
    }

    public void setBrightness(int brightness) {

        this.brightness = brightness;
    }
}
