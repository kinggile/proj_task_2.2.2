package web.model;

public class Car {
    private String carModel;
    private int length;
    private int width;

    public Car(String carModel, int length, int width) {
        this.carModel = carModel;
        this.length = length;
        this.width = width;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
