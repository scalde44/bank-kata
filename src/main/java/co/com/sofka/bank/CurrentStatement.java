package co.com.sofka.bank;

public class CurrentStatement {
    private final StatementDate statementDate;
    private final Money currentBalance;

    public CurrentStatement(StatementDate statementDate, Money currentBalance) {
        this.statementDate = statementDate;
        this.currentBalance = currentBalance;
    }

    public String getStatementDate() {
        return statementDate.value();
    }

    public String getCurrentBalance() {
        return currentBalance.amount();
    }
}
