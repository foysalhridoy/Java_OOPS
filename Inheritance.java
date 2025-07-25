class Vehicle{
    double price;
    double mileage;
    String color;

    void display(){
        System.out.println("Price: "+price);
        System.out.println("Milage: "+mileage);
        System.out.println("Color: "+color);
    }
}

class Car extends Vehicle{
    String ftype;
    boolean sunroof;
    String model;

    void view(){
        System.out.println("Fuel Type: "+ftype);
        System.out.println("Sunroof: "+sunroof);
        System.out.println("Model: "+model);
    }
}
public class inheritance1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.price = 100000;
        c1.mileage = 15.5;
        c1.color = "Red";
        c1.ftype = "Petrol";
        c1.sunroof = false;
        c1.model = "Toyota";

        c1.display();
        c1.view();
    }
}
