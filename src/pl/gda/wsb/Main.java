package pl.gda.wsb;

import java.io.FileWriter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Animal animal1 = new Animal("cow", "Espresso", 150);
        Animal animal2 = new Animal("dog", "Fiflak", 15);
        System.out.println(animal1);
        System.out.println(animal2);

        Human human1 = new Human("Katarzyna", 21, "kobieta");
        Human human2 = new Human("LukasZ", 24, "meżczyzna");
        System.out.println(human1);
        System.out.println(human2);

        Phone phone1 = new Phone("Samsung", 1);
        Phone phone2 = new Phone("IPhone", 1);
        System.out.println(phone1);
        System.out.println(phone2);

        if (animal1.weight > animal2.weight) {
            System.out.println("Zwierze " + animal1.name + " wazy " + animal1.weight + " kg");
        } else {
            System.out.println("Zwierze " + animal2.name + " wazy " + animal2.weight + " kg");
        }


       ArrayList<Human> humansList = new ArrayList<>();
          humansList.add(human1);
          humansList.add(human2);
          System.out.println("Lista humans ");
        for (Human human : humansList){
            System.out.println(human.name + " " + human.age);
        }


    }
}
