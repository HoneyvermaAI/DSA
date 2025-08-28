package OOPS;

import java.util.SortedMap;

class Car{
    String brand;
    String Model;
    int Speed;
    boolean isABSPresent;

    // constructor with parameters
    Car(String brand , String Model, int Speed, boolean isABSPresent ){
        // We use this keyword to access the global variable from the class.
        System.out.println("Initialisation");
        this.brand = brand;
        this.Model = Model;
        this.isABSPresent = isABSPresent;
        this.Speed = Speed;
        System.out.println("Initialization Done");
    }
    // This is the default constructor.
    Car(){
        System.out.println("This is the Default Constructor");
         this.brand = "Suzuki";
         this.Model = "Swift";
        this.Speed = 100;
        this.isABSPresent = true;
    }

}

public class OOPS1 {
    public static void main(String[] args) {
        // This object calls the default constructor
        Car object = new Car();
        System.out.println("Speed : " + object.Speed);

        // This object calls the parameter constructor.
        Car object2 = new Car("Ford", "Endevar" , 100 , true);
        System.out.println("Brand : " + object2.brand);

    }
}
