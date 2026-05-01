package model;

public class Account {
    private int accountnumber;
    private String username;
    private double balance;

    public Account(int accountnumber,String username,double balance){
        this.accountnumber=accountnumber;
        this.username=username;
        this.balance=balance;
    }

    public void setnumber(int number){
        this.accountnumber=number;
    }

    public int getnumber(){
        return accountnumber;
    }

    public void setusername(String username){
        this.username=username;
    }

    public String getusername(){
        return username;
    }

    public void setbalance(double balance){
        this.balance= balance;
    }

    public double getbalance(){
        return balance;
    }

    public double deposite(double amount){
        balance += amount;
        return balance;
    }

    public Double withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance;");
        }
        balance-= amount;
        return balance;
    }

    public String toString(){
        return "Account[number= "+accountnumber+" , username= "+username +", balance= "+balance+"]";
    }

}
