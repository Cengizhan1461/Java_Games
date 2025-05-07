package at.cengizhan.Test;

public class Train implements Vehicle{

    private String name;
    private int ID;

    public Train(String name, int ID) {
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
        System.out.println("The train is driving");
    }
}
