package devopsi;

import java.util.List;

/*
Zoo będzie składać się
    pól prywatnych name, yearOfEstablishment, animals (typ List<Animal>)
    konstruktora ustawiającego początkowe wartości pól prywatnych
    publiczną metodę addAnimal(Anima animal) dodająca dany obiekt zwierzaka do listy animals
    publiczna metodę showAnimals() wyświetlająca wszystkie zwierzaki Zoo
    publiczna metodę countAnimals() zwracająca liczbe zwierzaków
    prywatnej metody avgAge() zwracającej średni wiek zwierząt
    getter do pola prywatnego animals
    publicznej metody showInfo() wyświetlającej info o Zoo, jak średni wiek zwierząt, nazwa, rok założenia
 */

public class Zoo {
    private String name;
    private int earOfEstablishment;
    private List<Animal> animals;

    public Zoo(String name, int earOfEstablishment, List<Animal> animals) {
        this.name = name;
        this.earOfEstablishment = earOfEstablishment;
        this.animals = animals;
    }

    public String getName(){
        return name;
    }

    public int getEarOfEstablishment(){
        return earOfEstablishment;
    }

    public List<Animal> getAnimals(){
        return animals;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void showAnimals() {
        for (Animal listElement : animals) {
            System.out.println(listElement);
        }
    }

    public int countAnimals(){
        return animals.size();
    }

    private float avgAge(){
        int sumOfAge = 0;
        for (Animal listElement : animals) {
            sumOfAge = sumOfAge + listElement.getAgeOfAnimal();
        }

        return  sumOfAge /countAnimals();

    }

    public void showInfo(){
        System.out.println("Nazwa Zoo: " + name);
        System.out.println("Rok założenia: " + earOfEstablishment);
        System.out.println("Średni wiek zwierzat w zoo: " + avgAge());
    }

}
