public class A {
    public static void sum(int x, int y) {
        int z = x + y;
        System.out.println("Sum is " + z);
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        sum(x, y); // directly call without object
    }
}
