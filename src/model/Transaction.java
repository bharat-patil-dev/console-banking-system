package model;

import java.time.LocalDateTime;

public class Transaction {
    private String transactiontype;
    private double amount;
    private LocalDateTime datetime;

    public Transaction(String transactiontype, double amount){
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
