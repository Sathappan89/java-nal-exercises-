package ExceptionHandlingJava;

public class ThrowExample {
    public static void main(String[] args) {
        int num = -5;
        if (num < 0) {
            throw new ArithmeticException("Number cannot be negative");
        }
        System.out.println("Square: " + (num * num));
    }
}