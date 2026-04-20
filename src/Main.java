import model.Account;
import model.Transaction;
import service.BankingService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Account ac= new Account(1,"bharat patil",1200.00);
//        ac.deposite(100);
//        System.out.println(ac.getbalance());
//        ac.withdraw(134);
//        System.out.println(ac.getbalance());
//        System.out.println(ac);

        BankingService bs= new BankingService();
        bs.addAccount(5002,"alex joe",1200);
        bs.addAccount(5002,"alexjoe",1200);
        System.out.println(accounts.get(accountnumber));


    }
}
