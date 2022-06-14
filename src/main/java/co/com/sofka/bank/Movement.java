package co.com.sofka.bank;

import java.util.Objects;

public class Movement {
    private final Money credit;
    private final Money debit;

    public Movement(Money credit, Money debit) {
        this.credit = Objects.requireNonNull(credit);
        this.debit = Objects.requireNonNull(debit);
    }

    public String getCredit() {
        return credit.amount();
    }

    public String getDebit() {
        return debit.amount();
    }

}
