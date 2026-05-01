package service;
import model.Account;
import model.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingService {
    Map<Integer, Account> accounts= new HashMap<>();
    Map<Integer, List<Transaction>> transactions= new HashMap<>();

    public void addAccount(int accountnumber, String username, double initialBalance){
        if(accounts.containsKey(accountnumber)){
            System.out.println("Account is Already created");
            return;
        }
        if(initialBalance<0){
            System.out.println("initial balance can not be negative..");
            return;
        }

        Account ac= new Account(accountnumber,username,initialBalance);
        accounts.put(accountnumber,ac);
        transactions.put(accountnumber,new ArrayList<>());
        System.out.println("Account Creating Successful");
    }

    public Account getAccount(int accountNumber){
        if(!accounts.containsKey(accountNumber)){
            System.out.println("Account not found!");
            return null;
        }
        return accounts.get(accountNumber);
    }

    public void deposit(int accountNumber , double amount ){
        if(!accounts.containsKey(accountNumber)){
            System.out.println("account is not created");
            return;

        }
        if(amount<=0){
            System.out.println("Amount Can't be negative");
            return;
        }

        Account acc = accounts .get(accountNumber);

        acc.deposite(amount);

        transactions.get(accountNumber).add(new Transaction("Deposite", amount));

        System.out.println("Amount deposited successfully!");
    }

    public void withdraw(int accountNumber , double amount){
        if(!accounts.containsKey(accountNumber)){
            System.out.println("Account not found");
            return;
        }

        if(amount<=0){
            System.out.println("amount must be greater then 0");
            return;
        }

        Account acc= accounts.get(accountNumber);


        if(acc.getbalance()<amount) {
            System.out.println("Insufficient balance");
            return;
        }

        acc.withdraw(amount);

        transactions.get(accountNumber).add(new Transaction("withdraw",amount));

        System.out.println("Withdraw Successful");

    }

    public void checkbalance(int accountNumber){
        if(!accounts.containsKey(accountNumber)){
            System.out.println("Account Not Found");
            return ;
        }

        Account ac = accounts.get(accountNumber);
        System.out.println("current Balance: "+ac.getbalance());
    }

    public void showTransactions(int accountNumber) {

        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found!");
            return;
        }

        List<Transaction> list = transactions.get(accountNumber);

        if (list.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        for (Transaction t : list) {
            System.out.println(t);
        }
    }

    public void showAllAccounts() {

        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }

        for (Account acc : accounts.values()) {
            System.out.println(acc);
        }
    }
}
