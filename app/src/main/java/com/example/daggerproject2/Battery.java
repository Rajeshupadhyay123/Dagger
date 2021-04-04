package com.example.daggerproject2;

import android.util.Log;

import javax.inject.Inject;

public class Battery {

    private Cobalt cobalt;
    private Lithum lithum;
    /**
     * Here we are telling the dagger to create the injection by specify @Injection annotation
     * But for making the Battery we need two thing Cobalt and Lithum object reference....
     */
    @Inject
    public Battery(Cobalt cobalt,Lithum lithum) {
        this.cobalt=cobalt;
        this.lithum=lithum;
        Log.i("mymobile", "Battery: ");
    }
}

/**
 * Here the order of execution will be---
 * First it create Cobalt object
 * Second it create Lithum object
 **/