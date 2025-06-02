//Class and Object 
class Car {
    String color;
    int speed;

    public void drive() {
        System.out.println("Car is driving at speed: " + speed);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating object
        myCar.color = "Red";
        myCar.speed = 100;
        myCar.drive();
    }
}
