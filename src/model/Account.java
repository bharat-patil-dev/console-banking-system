package model;

public class Account {
    int number;
    String username;
    double balance;

    public Account(int number,String username,double balance){
        this.number=number;
        this.username=username;
        this.balance=balance;
    }

    public void setnumber(int number){
        this.number=number;
    }

    public int getnumber(){
        return number;
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
        return "Account[number= "+number+" , username= "+username +", balance= "+balance+"]";
    }

}
