package co.com.sofka.bank;

public class StatementDetail {
    private final CurrentStatement currentStatement;
    private final Movement movement;

    public StatementDetail(CurrentStatement currentStatement, Movement movement) {
        this.currentStatement = currentStatement;
        this.movement = movement;
    }

    public String statementDate() {
        return currentStatement.getStatementDate();
    }

    public String statementBalance() {
        return currentStatement.getCurrentBalance();
    }

    public String statementCredit() {
        return movement.getCredit();
    }

    public String statementDebit() {
        return movement.getDebit();
    }
}
