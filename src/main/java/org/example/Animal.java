package org.example;

public abstract class Animal implements AnimalInterface {
    private String sound;

    public Animal(String sound) {
        this.sound = sound;
    }

public String getSound(){
        return sound;
}

}
