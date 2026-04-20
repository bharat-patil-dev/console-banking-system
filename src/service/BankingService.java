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
}
