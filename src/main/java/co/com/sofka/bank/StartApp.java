package co.com.sofka.bank;

import static co.com.sofka.bank.Money.amountOf;
import static co.com.sofka.bank.StatementDate.dateOf;

public class StartApp {
    public static void main(String[] args) {
        var account = new Account(new Statement());
        account.deposit(amountOf(1000), dateOf("10/01/2021"));
        account.deposit(amountOf(2000), dateOf("13/01/2021"));
        account.withDrawal(amountOf(500), dateOf("14/01/2021"));

        account.printStatements();
    }
}
