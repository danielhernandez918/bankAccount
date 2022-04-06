public class BankAccountTest {
    
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount(0, 200);
        System.out.println(BankAccount.allMoney());
        System.out.println(BankAccount.accountCount());
        user1.depositChecking();
        user1.withdrawChecking();
        user1.depositSavings();
        // System.out.println(user1.getChecking());
        user1.displayAccounts();
        System.out.println(BankAccount.allMoney());
    }
}
