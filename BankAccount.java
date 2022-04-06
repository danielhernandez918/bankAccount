import java.util.Scanner;
public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts =0;
    public BankAccount(){}
    
    public BankAccount(double checking, double savings) {
        checkingBalance  = checking;
        savingsBalance = savings;
        numberOfAccounts++;
    }

    public static int accountCount() {
        return numberOfAccounts;
    }

    public double getChecking() {
        return this.checkingBalance;
    }

    public double getSavings() {
        return this.savingsBalance;
    }
    public void depositChecking() {
        Scanner sc= new Scanner(System.in); 
        System.out.println("Please enter amount deposited:");
        this.checkingBalance += sc.nextInt();
    }
    public void depositSavings() {
        Scanner sc= new Scanner(System.in); 
        System.out.println("Please enter amount deposited:");
        this.savingsBalance += sc.nextInt();
    }
    public void withdrawChecking() {
        Scanner sc= new Scanner(System.in); 
        System.out.println("Please enter amount deposited:");
        this.checkingBalance -= sc.nextInt();
    }
    public void withdrawSavings() {
        Scanner sc= new Scanner(System.in); 
        System.out.println("Please enter amount deposited:");
        this.savingsBalance -= sc.nextInt();
    }
    public void displayAccounts() {
        double checkingAmt = this.getChecking();
        double savingsAmt = this.getSavings();
        System.out.printf("Checking Balance: %s, Savings Balance: %s \n\n", checkingAmt, savingsAmt);
        
    }


}