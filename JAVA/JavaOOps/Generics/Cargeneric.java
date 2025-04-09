package JavaOOps.Generics;

import JavaOOps.Interface.Car;

public class Cargeneric {
    public static void main(String[] args) {
        car<String> strModel = new car<>();
        strModel.setValue("Honda City");
        System.out.println("Model of the car : " + strModel.getValue());
        car<Integer> intprice = new car<>();
        intprice.setValue(1500000);
        System.out.println("Price of the car : " + intprice.getValue());


    }
}
    class car<T>{
        private T value;
        public void setValue(T value){
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }

