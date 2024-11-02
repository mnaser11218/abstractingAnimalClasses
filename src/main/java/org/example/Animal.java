package org.example;

public class Animal {
    private String sound;

    public Animal(String sound) {
        this.sound = sound;
    }
    public void speak(){
        System.out.println(sound);
    }

}
