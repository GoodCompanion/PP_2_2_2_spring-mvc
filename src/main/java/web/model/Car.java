package web.model;

public class Car {
    private String model;
    private int maxSpeed;
    private int doorCount;

    public Car() {
    }

    public Car(String model, int maxSpeed, int doorCount) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.doorCount = doorCount;
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

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", doorCount=" + doorCount +
                '}';
    }
}
