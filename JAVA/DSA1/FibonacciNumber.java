package DSA1;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("The fibonacci is: " + Fibonumbers(10));

    }

    static int Fibonumbers(int num) {
        if (num < 2) {
            return num;
        } else {
            return Fibonumbers(num - 1) + Fibonumbers(num - 2);
        }
    }
}
