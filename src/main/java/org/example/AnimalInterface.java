package org.example;

public interface AnimalInterface {
    default void speak(){
        System.out.println(getSound());
    }

    String getSound();

}
