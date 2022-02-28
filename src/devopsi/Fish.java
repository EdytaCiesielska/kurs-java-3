package devopsi;

public class Fish extends Animal implements Speakable{

    private String color;

    public Fish(String name, int yearOfBirth, TypeOfAnimal type, String color) {
        super(name, yearOfBirth, type);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public void sound() {
        System.out.println("Plum");
    }
}
