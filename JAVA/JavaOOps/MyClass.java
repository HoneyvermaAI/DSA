package JavaOOps;

public class MyClass {
    void greet() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Object creation inside main method
        obj.greet(); // Calling non-static method using object
    }
}

