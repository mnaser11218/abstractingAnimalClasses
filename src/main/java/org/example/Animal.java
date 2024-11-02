package org.example;

public abstract class Animal implements AnimalInterface {
    private final String food;
    private String sound;

    public Animal(String sound, String food) {
        this.sound = sound;
        this.food = food;
    }

public String getSound(){
        return sound;
}
public String getFood(){
        return food;
}

}
