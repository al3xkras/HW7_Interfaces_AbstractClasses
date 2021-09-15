package ua.kpi.tef;

import ua.alexkras.Triangle;
import ua.alexkras.car.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Shape shape = new Triangle(new Point(3.0001,4.0001),
                new Point(7,6),
                new Point(3.0012,4.0002));
        System.out.println(shape);

        System.out.println("\n");



        Car car = new Car(2345,150, DriverLicense.Category.A,
                new Accumulator(50000,150,30,200,"Volkswagen"),
                false,new Wheel(50));

        car.drive(new Driver("Bohdan",new DriverLicense(DriverLicense.Category.C,40293)));
        car.drive(new Driver("Bohdan",new DriverLicense(DriverLicense.Category.A,10202)));

        System.out.println("\n");

        car.changeAccumulator(new Accumulator(35000,200,30,200,"Toyota"));
        car.changeAccumulator(new Accumulator(35000,150,30,200,"Toyota"));

        System.out.println("\n");

        Refueller refueller = new Refueller("Andrew");
        refueller.refuelCar(car);
        refueller.refuelCar(car);

        System.out.println("\n");

        Wheel wheel1 = new Wheel(50);
        Wheel wheel2 = new Wheel(100);

        wheel1.changeWheel(car);
        wheel2.changeWheel(car);

    }
}
