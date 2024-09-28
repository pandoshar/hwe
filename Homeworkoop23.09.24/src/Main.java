//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PersonalAccount personalAccount = new PersonalAccount();
        personalAccount.personalAccount(23014,"adilet",10);
        personalAccount.deposit(1.4);
        personalAccount.withdraw(1.5);
        personalAccount.deposit(1.6);
        personalAccount.printTransactionHistory();
        System.out.println(personalAccount.getBalance());
        System.out.println(personalAccount.getAccountholder());
        System.out.println(personalAccount.getAccountnumber());

    }
}
enum TransactionType {
    DEPOSIT,
    WITHDRAWAL
}

