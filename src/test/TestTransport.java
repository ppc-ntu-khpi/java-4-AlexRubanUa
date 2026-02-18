package test;

import domain.Car;
import domain.Airplane;

public class TestTransport {

    public static void main(String[] args) {
        Car car = new Car("Audi");
        System.out.println(car);
        car.move();
        car.playMusic();
        car.changeSpeed();
        car.stop();

        System.out.println("\n\n");
        Airplane airplane = new Airplane("Hihanki and Hahanki 5000");
        System.out.println(airplane);
        airplane.move();
        airplane.changeSpeed();
        airplane.deployChassis();
        airplane.broadcastMessage("Паййояйо Паййояйо...");
        airplane.stop();
    }
}
