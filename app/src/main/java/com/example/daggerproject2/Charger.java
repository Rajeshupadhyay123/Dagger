package com.example.daggerproject2;

import android.util.Log;

import javax.inject.Inject;

public class Charger {

    @Inject
    public Charger() {
    }

    void setCharger(Mobile mobile){
        Log.i("mymobile", "setCharger: ");
    }
}
