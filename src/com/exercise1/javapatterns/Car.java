package com.exercise1.javapatterns;

import com.exercise1.javapatterns.Engine;
import com.exercise1.javapatterns.Wheel;

/**
 * Created by kavita on 25/6/16.
 */
public class Car {
    Engine engine;
    Wheel wheel;

    Car(Engine engine,Wheel wheel){
        this.engine=engine;
        this.wheel=wheel;
    }

    void drive(){
        System.out.println("speed of car : "+engine.getCanRun());
        System.out.println("Duration of car : " + wheel.getDuration());
    }


}
