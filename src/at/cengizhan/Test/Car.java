package at.cengizhan.Test;

public class Car implements Vehicle{

    private String name;
    private int ID;

    public Car(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return ID;
    }

    @Override
    public void drive() {
        System.out.println("The car is driving.");
    }
}
