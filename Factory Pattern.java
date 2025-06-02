interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle drawn");
    }
}

class ShapeFactory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("circle");
        shape.draw();
    }
}
