class Student {
    String name;
    int id;

    Student(String n, int i) {
        name = n;
        id = i;
    }

    public void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Hridoy", 101);
        s1.display();
    }
}
