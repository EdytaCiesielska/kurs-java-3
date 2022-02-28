package devopsi;

public class Dog extends Animal implements Speakable{
    private String breed;

    public Dog(String name, int yearOfBirth, TypeOfAnimal type, String breed) {
        super(name, yearOfBirth, type);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void sound() {
        System.out.println("Hau, hau!!!");
    }
}
