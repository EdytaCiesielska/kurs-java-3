package devopsi;

import java.util.Objects;

/*
Animal będzie składać się
    pól prywatnych name, yearOfBirth, type (enum - REPTILE, AMPHIBIAN)
    publicznych metod dostępowych do powyższych pól tzw gettery, settery
    nadpisanie metod equals, hashCode, toString z klasy Object, przy użyciu getterów pól prywatnych
    statycznego a zarazem prywatnego pola CURRENT_YEAR=2022
    publicznej metody zwracającej wiek zwierzaka (warto wykorzystać CURRENT_YEAR)
    konstruktora ustawiającego początkowe wartości pól prywatnych (bez statycznych)
    zaimplementuj (Wyświetl domyślny dźwięk) interfejsu sound() w klasie Animal,
 */

public class Animal implements Speakable {
    private String name;
    private int yearOfBirth;
    private TypeOfAnimal type;
    private static int CurrentYear = 2022;

    public Animal(String name, int yearOfBirth, TypeOfAnimal type) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public TypeOfAnimal getType() {
        return type;
    }

    public void setType(TypeOfAnimal type) {
        this.type = type;
    }

    public static int getCurrentYear() {
        return CurrentYear;
    }

    public static void setCurrentYear(int currentYear) {
        CurrentYear = currentYear;
    }

    public int getAgeOfAnimal() {
        return CurrentYear - yearOfBirth;
    }

    @Override
    public void sound() {
        System.out.println("No sound.");
    }

    @Override
    public int hashCode(){
       return Objects.hash(getName(), getYearOfBirth(), getType());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        Animal animal = (Animal) obj;
        return name == animal.getName() && yearOfBirth == animal.getYearOfBirth() && type == animal.getType();

    }

    @Override
    public String toString() {
        return "name: " + getName() + " year of birth: " + getYearOfBirth() + " type of animal: " + getType();
    }
}
