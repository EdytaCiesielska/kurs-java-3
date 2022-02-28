package devopsi;

public class Snake extends Animal implements Speakable{
    private double length;


    public Snake(String name, int yearOfBirth, TypeOfAnimal type, double length) {
        super(name, yearOfBirth, type);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void sound(){
        System.out.println("Sss...");
    }
}
