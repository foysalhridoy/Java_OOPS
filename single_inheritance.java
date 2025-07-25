class employee{
    void salary(){
        System.out.println("Salary = 70000");
    }
}
class hr extends employee{
    void bonus(){
        System.out.println("Bonus = 5000");
    }
}

public class inheritance3{
    public static void main(String[] args) {
        hr h1 = new hr();
        h1.salary();
        h1.bonus();
    }

}
