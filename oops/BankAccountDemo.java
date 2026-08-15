package oops;
import java.util.Scanner;
class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;
    BankAccount(int a, String h, double b) {
        accountNumber = a;
        accountHolder = h;
        balance = b;
    }
    void deposit(double amount) {
        balance = balance + amount;
    }
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder: ");
        String name = sc.nextLine();
        System.out.print("Enter Balance: ");
        double bal = sc.nextDouble();
        BankAccount b = new BankAccount(acc, name, bal);
        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();
        b.deposit(amount);
        b.displayDetails();
        sc.close();
    }
}