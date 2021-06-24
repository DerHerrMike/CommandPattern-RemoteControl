package com.mps.app.version3.appliances;

/**
 * / Created by Mike Schwingenschloegl in Jun 2021
 */
public class Lights extends AbstractAppliance {

    String name;
    int brightness;
    public static final int MAX_LIGHTS = 100;
    public static final int MIN_LIGHTS = 10;

    public Lights(String name) {

        this.name = name;

    }

    public void on(AbstractAppliance name) {
        setBrightness(100);
        System.out.println(getName() + " is now on. Brightness set to "+getBrightness()+"%");
    }


    public void off(AbstractAppliance name) {
        setBrightness(0);
        System.out.println(getName()+" is now off");
    }


    public void up(AbstractAppliance name) {
        int i = getBrightness();
        if(i<MAX_LIGHTS){
            setBrightness(getBrightness()+10);
            System.out.println(getName()+" brightness increased from "+i+" to "+getBrightness());
        } else System.out.println(getName()+" brightness already 100%");
    }


    public void down(AbstractAppliance name) {

        int i = getBrightness();
        if(i>MIN_LIGHTS){
            setBrightness(getBrightness()-10);
            System.out.println(getName()+" brightness reduced from "+i+" to "+getBrightness());
        }else if (i==MIN_LIGHTS){
            System.out.println(getName()+ " already on minimum brightness of 10%");
        } else System.out.println(getName()+" dark");
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
