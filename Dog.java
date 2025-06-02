//Final keywards
class Animal {
    final void run() {
        System.out.println("Running...");
    }
}

class Dog extends Animal {
    // void run() {} ❌ Cannot override final method
}

public class Main {
    public static void main(String[] args) {
        new Dog().run();
    }
}
