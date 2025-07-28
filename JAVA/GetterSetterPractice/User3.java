package GetterSetterPractice;

public class User3 {
    private String accountNumber;
    private double balance;

    public User3(){}
    public User3(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
