package com.example.daggerproject2;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

    @Inject
    Battery battery;

    private Processor processor;

    /**
     * for providing the injection we have to tell the dagger about field member
     * @param processor is the reference of the Processor class
     * @param battery is the reference of the Battery Class
     *
     * we have also declared the @Inject with the submember of the class, i.e: Processor and Battery
     */
    @Inject
    public Mobile(Processor processor,Battery battery){
        this.battery=battery;
        this.processor=processor;
    }

    public void run(){
        Log.i("mymobile", "run: ");
    }

    /**
     * This is a method injection
     * @param charger is a reference of Charger Class and telling them @Inject
     */
    @Inject
    public void connectCharger(Charger charger){
        charger.setCharger(this);
    }
}

/**
 * =======================================
 * Order of Injection:--
 * First constructor injection
 * Second field injection
 * Third method injection
 */
