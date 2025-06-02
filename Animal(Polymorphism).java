//Method Overriding (Run-Time Polymorphism)
class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Cat(); // Upcasting
        a.sound(); // Output: Cat meows.
    }
}
