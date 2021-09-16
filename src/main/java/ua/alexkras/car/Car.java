package ua.alexkras.car;

public class Car implements RefuelCar,WheelCar{
    private double weight;
    private int maxSpeed;
    private DriverLicense.Category vehicleCategory;
    private CarAccumulator accumulator;
    private boolean isRefuelled;
    private Wheel wheel;

    public Car(double weight, int maxSpeed,
               DriverLicense.Category vehicleCategory,
               CarAccumulator accumulator, boolean isRefuelled,
               Wheel wheel){
        this.weight=weight;
        this.maxSpeed=maxSpeed;
        this.vehicleCategory=vehicleCategory;
        this.accumulator=accumulator;
        this.isRefuelled=isRefuelled;
        this.wheel=wheel;
    }

    public void drive(CarDriver driver){
        if (driver.getDriverLicense().getCategory()==vehicleCategory){
            System.out.println("Driving...");
        } else {
            System.out.println("Driver's license does not allow them to drive this car.");
        }
    }

    public void changeAccumulator(CarAccumulator accumulator){
        if (!(accumulator.width()==this.accumulator.width() &&
                accumulator.height()==this.accumulator.height() &&
                accumulator.length()==this.accumulator.length())){
            System.out.println("Accumulator is not compatible with this car.");
            return;
        }

        this.accumulator=accumulator;

        System.out.println("Accumulator was changed successfully.");
    }

    @Override
    public Wheel wheel(){
        return wheel;
    }

    @Override
    public void setWheel(Wheel wheel){
        this.wheel=wheel;
    }

    @Override
    public boolean refuelled(){
        return isRefuelled;
    }

    @Override
    public void setRefuelled(boolean refuelled){
        this.isRefuelled=refuelled;
    }

    public void sellCar(){
        System.out.println("Car was sold by owner. (Or someone else, who has access to this method)");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public CarAccumulator getAccumulator() {
        return accumulator;
    }

    public DriverLicense.Category getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(DriverLicense.Category vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setAccumulator(CarAccumulator accumulator) {
        this.accumulator = accumulator;
    }


}
