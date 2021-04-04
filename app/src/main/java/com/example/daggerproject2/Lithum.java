package com.example.daggerproject2;

import android.util.Log;

public class Lithum {

    /**
     * let the Lithum has an library that code are already written and we cannot make any changes
     * then in this case we have to create an module class and use @Module and @Provides annotation
     * you can see in the MobileModule class.
     */
    public Lithum() {
        Log.i("mymobile", "Lithum: ");
    }

    public void done(){
        Log.i("mymobile", "done: ");
    }
}
