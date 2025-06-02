//Static keywards
class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter(); // Output: 1, 2, 3
    }
}
