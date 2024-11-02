package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.speak();
        cat.speak();
        printSpeech(dog, cat);

    }
    public static void printSpeech(Animal... animals){
        for(Animal ele: animals){
        ele.speak();
        }
    }

}