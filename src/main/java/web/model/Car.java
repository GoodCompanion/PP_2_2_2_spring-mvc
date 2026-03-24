package web.model;

public class Car {
    private String model;
    private int maxSpeed;
    private int dorCount;

    public Car() {
    }

    public Car(String model, int maxSpeed, int dorCount) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.dorCount = dorCount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getDorCount() {
        return dorCount;
    }

    public void setDorCount(int dorCount) {
        this.dorCount = dorCount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", dorCount=" + dorCount +
                '}';
    }
}
