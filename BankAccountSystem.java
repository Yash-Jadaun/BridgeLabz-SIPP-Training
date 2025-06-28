class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    void display() {
        if (this instanceof BankAccount) {
            System.out.println("Account Holder: " + accountHolderName + ", Account Number: " + accountNumber);
        }
    }
}
