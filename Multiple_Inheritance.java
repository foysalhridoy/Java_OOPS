class A{
    void methodA(){
        System.out.println("Method of class A");
    }
}

class B extends A{
    void methodB(){
        System.out.println("Method of class B");
    }
}

class C extends B{
    void methodC(){
        System.out.println("Method os class C");
    }
}
public class inheritance4 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.methodC();
        c1.methodB();
        c1.methodA();
    }
}
