import java.util.ArrayList;

class PersonalAccount {
    int accountnumber;
    String accountholder;
    double balance = 0.0;
    ArrayList<Amount> transactions = new ArrayList<Amount>();

    public void personalAccount(int accountnumber, String accountholder, double balance) {
        this.accountnumber = accountnumber;
        this.accountholder = accountholder;
        this.balance = balance;
    }

    void deposit(double amount) {
        Amount deposit = new Amount(amount, TransactionType.DEPOSIT);
        transactions.add(deposit);
        balance += amount;
    }

    void withdraw(double amount) {
        Amount withdraw = new Amount(amount, TransactionType.WITHDRAWAL);
        transactions.add(withdraw);
        balance -= amount;
    }

    void printTransactionHistory() {
        for (Amount transaction : transactions) {
            System.out.println(transaction.transactiontype);
        }
    }

    double getBalance() {
        return balance;
    }

    int getAccountnumber() {
        return accountnumber;
    }

    String getAccountholder() {
        return accountholder;
    }
}
