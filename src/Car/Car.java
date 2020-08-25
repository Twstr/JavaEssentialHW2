package Car;

public class Car {
    private int year;
    private String color;

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }
    public Car(String color) {
        this.color = color;
    }
    public Car(int year) {
        this.year = year;
    }
    public Car() {
    }
}
