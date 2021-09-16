package ua.alexkras.car;

public class Accumulator implements CarAccumulator{
    private int capacity,
                width,
                height,
                length;
    private String manufacturerName;

    public Accumulator(int capacity, int width,
                       int height, int length,
                       String manufacturerName){
        this.capacity=capacity;
        this.height=height;
        this.width=width;
        this.length=length;
        this.manufacturerName=manufacturerName;
    }

    @Override
    public int height() {
        return height;
    }

    @Override
    public int width() {
        return width;
    }

    @Override
    public int length() {
        return length;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }


}
