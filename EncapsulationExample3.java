class Car {
    private String brand;
    private int speed;

    // Setter Methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter Methods (void - just print values)
    public void getBrand() {
        System.out.println("Car Brand: " + brand);
    }

    public void getSpeed() {
        System.out.println("Car Speed: " + speed + " km/h");
    }
}

public class EncapsulationExample3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Tesla");
        car.setSpeed(200);

        car.getBrand();
        car.getSpeed();
    }
}
