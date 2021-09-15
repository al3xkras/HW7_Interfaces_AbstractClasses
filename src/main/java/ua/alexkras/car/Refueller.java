package ua.alexkras.car;

public class Refueller {
    String name;

    public Refueller(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void refuelCar(RefuelCar car){
        if (!car.refuelled()){
            car.setRefuelled(true);
            System.out.println("Refuelled.");
            return;
        }
        System.out.println("Car is already refuelled!");
    }
}
