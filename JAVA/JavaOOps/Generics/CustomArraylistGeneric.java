package JavaOOps.Generics;

//public class CustomArraylistGeneric {

//}
// Generic class
class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class CustomArraylistGeneric {
    public static void main(String[] args) {
        // Using Box with Integer
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println("Integer Value: " + intBox.getValue());

        // Using Box with String
        Box<String> strBox = new Box<>();
        strBox.setValue("Hello, Generics!");
        System.out.println("String Value: " + strBox.getValue());

        // Using Box with Double
        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(99.99);
        System.out.println("Double Value: " + doubleBox.getValue());
    }
}

