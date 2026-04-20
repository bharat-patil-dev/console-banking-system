package model;

import java.time.LocalDateTime;

public class Transaction {
    String transactiontype;
    int amount;
    LocalDateTime datetime;

    public Transaction(String transactiontype, int amount){
        this.transactiontype=transactiontype;
        this.amount= amount;
        this.datetime=LocalDateTime.now();
    }

    public String toString(){
        return "Transaction[type=" + transactiontype +
                ", amount=" + amount +
                ", datetime=" + datetime + "]";
    }

}
