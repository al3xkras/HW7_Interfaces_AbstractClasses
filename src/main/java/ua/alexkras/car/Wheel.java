package ua.alexkras.car;

public class Wheel {
    private int wheelRadius;

    public Wheel(int wheelRadius){
        this.wheelRadius=wheelRadius;
    }

    public void changeWheel(WheelCar car){
        if (car.wheel().getWheelRadius()==this.wheelRadius){
            System.out.println("Changing wheel...");
            car.setWheel(this);
            return;
        }
        System.out.println("Wheel's radius does not match!");
    }

    public int getWheelRadius() {
        return wheelRadius;
    }

    public void setWheelRadius(int wheelRadius) {
        this.wheelRadius = wheelRadius;
    }
}
