package org.example;

public interface AnimalInterface {
    default void speak(){
        System.out.println(getSound());
    }

    String getSound();
    default void eatFood(){
        System.out.println("currently eating: "  + getFood());
    }
    String getFood();

}
