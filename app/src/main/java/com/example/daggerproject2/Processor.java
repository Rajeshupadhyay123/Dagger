package com.example.daggerproject2;

import android.util.Log;

import javax.inject.Inject;

public class Processor {

    private static final String TAG = "mymobile";

    /**
     * Here we are telling the dagger to create the injection by specify @Injection annotation
     */
    @Inject
    public Processor() {
        Log.i(TAG, "Processor: ");
    }
}
