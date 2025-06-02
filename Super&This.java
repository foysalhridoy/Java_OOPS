//Super and This Keywords
class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";

    void printColor() {
        System.out.println(super.color); // Parent class color
        System.out.println(this.color);  // Current class color
    }
}

public class Main {
    public static void main(String[] args) {
        new Dog().printColor();
    }
}
