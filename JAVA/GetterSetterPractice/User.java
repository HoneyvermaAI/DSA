package GetterSetterPractice;

public class User {
    private String name;
    private int rollNumber;
    public User(){}
    public User(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber= rollNumber;
    }

}
