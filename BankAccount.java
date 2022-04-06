import java.util.Scanner;
public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalMoney = 0;
    public BankAccount(){}
    
    public BankAccount(double checking, double savings) {
        checkingBalance  = checking;
        savingsBalance = savings;
        numberOfAccounts++;
        totalMoney += checkingBalance + savingsBalance;
    }

    public static int accountCount() {
        return numberOfAccounts;
    }

    public static double allMoney() {
        return totalMoney;
    }

    public double getChecking() {
        return this.checkingBalance;
    }

    public double getSavings() {
        return this.savingsBalance;
    }
    public void depositChecking() {
        System.out.println("Please enter amount deposited:");
        String number = System.console().readLine();
        double amount = Integer.parseInt(number);
        this.checkingBalance += amount;
        totalMoney+= amount;
    }
    public void depositSavings() {
        System.out.println("Please enter amount deposited:");
        String number = System.console().readLine();
        double amount = Integer.parseInt(number);
        this.savingsBalance += amount;
        totalMoney+= amount;
    }
    public void withdrawChecking() {
        if (this.checkingBalance > 0) {
            System.out.println("Please enter amount to withdraw:");
            String number = System.console().readLine();
            double amount = Integer.parseInt(number);
            this.checkingBalance -= amount;
            totalMoney-= amount;
            }
            else {
                System.out.println("Insufficient Funds");
            }
        }
    public void withdrawSavings() {
        if (this.savingsBalance > 0) {

        System.out.println("Please enter amount to withdraw:");
        String number = System.console().readLine();
        double amount = Integer.parseInt(number);
        this.savingsBalance -= amount;
        totalMoney-= amount;
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }
    public void displayAccounts() {
        double checkingAmt = this.getChecking();
        double savingsAmt = this.getSavings();
        System.out.printf("Checking Balance: %s, Savings Balance: %s \n\n", checkingAmt, savingsAmt);
    }


}