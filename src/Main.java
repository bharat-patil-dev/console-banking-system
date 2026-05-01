import service.BankingService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankingService bs = new BankingService();

        while (true) {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Show Transactions");
            System.out.println("6. Show All Accounts");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Initial Balance: ");
                    double bal = sc.nextDouble();

                    bs.addAccount(accNo, name, bal);
                    break;

                case 2:
                    System.out.print("Account Number: ");
                    int dAcc = sc.nextInt();
                    System.out.print("Amount: ");
                    double dAmt = sc.nextDouble();

                    bs.deposit(dAcc,  dAmt);
                    break;

                case 3:
                    System.out.print("Account Number: ");
                    int wAcc = sc.nextInt();
                    System.out.print("Amount: ");
                    double wAmt = sc.nextDouble();

                    bs.withdraw(wAcc, wAmt);
                    break;

                case 4:
                    System.out.println("Account Number to check balance: ");
                    bs.checkbalance(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Account number");
                    bs.showTransactions(sc.nextInt());
                    break;

                case 6:
                    bs.showAllAccounts();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}