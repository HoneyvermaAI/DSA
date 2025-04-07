package JavaOOps;
public class Student {
    public static void main(String[] args) {
        student honey = new student();
        System.out.println(honey.name);
        System.out.println(honey.marks);
        System.out.println(honey.salary);

    }

    public static class student {
        int marks;
        String name;
       int salary;


       // student () {
        //    this.marks = 90;
        //    this.name = "Honey verma";
        //    this.salary = 900000;

       // }
        student(){
            this(90,900000,"Honey");

        }
        student(int marks,int salary,String name){
            this. marks = marks;
            this.name = name;
            this.salary = salary;

        }

    }
}
