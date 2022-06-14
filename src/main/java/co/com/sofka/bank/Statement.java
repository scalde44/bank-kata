package co.com.sofka.bank;

import java.util.ArrayList;
import java.util.List;

public class Statement {
    private List<StatementDetail> statementDetails;

    public Statement() {
        this.statementDetails = new ArrayList<>();
    }

    public void addStatement(StatementDetail detail) {
        this.statementDetails.add(detail);
    }

    public String statements() {
        StringBuilder statements = new StringBuilder();
        statements.append("Date    |   Credit  |   Debit   |   Balance");
        statements.append("\n");
        for (StatementDetail detail : this.statementDetails) {
            statements.append(String.format("%s    |   %s  |   %s   |   %s",
                    detail.statementDate(), detail.statementCredit(),
                    detail.statementDebit(), detail.statementBalance()));
            statements.append("\n");
        }
        return statements.toString();
    }
}
