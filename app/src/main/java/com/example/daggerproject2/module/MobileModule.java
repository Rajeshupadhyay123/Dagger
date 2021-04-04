package com.example.daggerproject2.module;

import com.example.daggerproject2.Cobalt;
import com.example.daggerproject2.Lithum;

import dagger.Module;
import dagger.Provides;

@Module
public class MobileModule {

    @Provides
    Lithum getLithum(){
        Lithum lithum= new Lithum();
        lithum.done();
        return lithum;
    }

    /**
     * Here the dagger will identify this by their return type not their method name
     */
    @Provides
    Cobalt getCobalt(){
        return new Cobalt();
    }
}


/**
 * =============================================================
 * This will be only used if the provided class are not able to use constructor injection
 * It is mostly happend in case of third party library, where all the code are pre-written
 *  and we cannot changes, so in that case we have to create class and annotate it with
 * @Module and provided member are annoteded with @Provides
 */
