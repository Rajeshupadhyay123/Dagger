package com.example.daggerproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerproject2.component.DaggerMobileComponent;
import com.example.daggerproject2.component.MobileComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    /** this is field injection**/
    @Inject
    Mobile mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileComponent component= DaggerMobileComponent.create();
        //Mobile mobile=component.getMobile();
        component.inject(this); //here we are providing the MainActivity reference
        mobile.run();
    }
}

/**
 * ====================================================
 * In case of field injection, if the class has constructor injection then we need not to use to create
 * method in the component class.
 * But here we cannot create the constructor of the MainActivity class that's why here we are using
 * extra method in the component class.
 *
 * But in case of Mobile class, where we are using the constructor injection so where we are not using
 * any extra method. we directly provided the @Injection annotation
 **/