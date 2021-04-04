package com.example.daggerproject2.component;

import com.example.daggerproject2.MainActivity;
import com.example.daggerproject2.Mobile;
import com.example.daggerproject2.module.MobileModule;

import dagger.Component;

@Component(modules = MobileModule.class)
public interface MobileComponent {

   // Mobile getMobile();

    /**
     * for providing the field injection, we have a method that take the parameter of the
     * parent class in which the field is define
     * @param activity is the reference of the MainActivity class as required for field injection
     */
    void inject(MainActivity activity);
}
