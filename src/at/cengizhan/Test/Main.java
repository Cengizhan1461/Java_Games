package at.cengizhan.Test;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 1);
        Train train = new Train("Lokomotiv", 2);
        AeroCar aeroCar = new AeroCar("Lambo", 3);

        Dealer dealer = new Dealer();

        dealer.addVehicle(car);
        dealer.addVehicle(train);
        dealer.addVehicle(aeroCar);

        car.drive();
        train.drive();
        aeroCar.drive();

        dealer.printAllVehicles();



    }
}
