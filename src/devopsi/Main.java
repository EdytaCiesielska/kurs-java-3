package devopsi;

import java.util.ArrayList;
import java.util.List;

public class Main {

     public static void main(String[] args) {

         List<Animal> animals = new ArrayList<>();

         Zoo zoo = new Zoo("Zoo WARSZAWIANKA", 2020, animals);

         Animal lizard = new Animal("Marzenka", 2021, TypeOfAnimal.REPTILE);
         Animal frog = new Animal("Konrad", 2019, TypeOfAnimal.AMPHIBIAN);

         zoo.addAnimal(lizard);
         zoo.addAnimal(frog);

         zoo.showAnimals();
         zoo.countAnimals();
         zoo.showInfo();


         List<Speakable> voice = new ArrayList<>();

         Dog dog = new Dog("Burek", 2020, TypeOfAnimal.DOG, "kundel");
         Fish fish = new Fish("Helenka", 2021, TypeOfAnimal.FISH, "czerwony");
         Snake snake = new Snake("Janusz", 2018, TypeOfAnimal.SNAKE, 5.23);

         voice.add(dog);
         voice.add(fish);
         voice.add(snake);

         for (Speakable listElement : voice) {
             listElement.sound();
         }
    }
}
