package OOPS.this_static_final_keyword_and_instance_of_operator;
class BankAccount {
    static String bankName = "HDFC Bank";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;//
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Yash", 1001);
        BankAccount acc2 = new BankAccount("Shivani", 1002);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        BankAccount.getTotalAccounts();
    }
}
