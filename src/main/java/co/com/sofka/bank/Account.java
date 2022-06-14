package co.com.sofka.bank;

public class Account {
    private static final Money INITIAL_BALANCE = Money.amountOf(0);

    private Money balance;
    private Statement statement;

    public Account(Statement statement) {
        this.balance = INITIAL_BALANCE;
        this.statement = statement;
    }

    void deposit(Money amount, StatementDate fecha) {
        var balanceOperation = balance.add(amount);
        var movement = new Movement(amount, INITIAL_BALANCE);
        addStatement(fecha, balanceOperation, movement);
    }

    void withDrawal(Money amount, StatementDate fecha) {
        var balanceOperation = balance.substract(amount);
        var movement = new Movement(INITIAL_BALANCE, amount);
        addStatement(fecha, balanceOperation, movement);
    }

    private void addStatement(StatementDate fecha, Money balanceOperation, Movement movement) {
        var currentStatement = new CurrentStatement(fecha, balanceOperation);
        statement.addStatement(new StatementDetail(currentStatement, movement));
        updateBalance(balanceOperation);
    }

    void printStatements() {
        System.out.println(statement.statements());
    }

    private void updateBalance(Money balance) {
        this.balance = balance;
    }
}
