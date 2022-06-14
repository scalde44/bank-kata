package co.com.sofka.bank;

import java.math.BigDecimal;
import java.util.Objects;

public class Money {
    private static final int MINIMUM_AMOUNT = 0;

    private final BigDecimal amount;
    private final Currency currency;

    private Money(BigDecimal amount, Currency currency) {
        this.amount = validateAmount(amount);
        this.currency = Objects.requireNonNull(currency);
    }

    private BigDecimal validateAmount(BigDecimal amount) {
        Objects.requireNonNull(amount);
        if (amount.compareTo(BigDecimal.ZERO) < MINIMUM_AMOUNT) {
            throw new IllegalArgumentException();
        }
        return amount;
    }

    public static Money amountOf(int amount) {
        return new Money(new BigDecimal(amount), Currency.COP);
    }

    public String amount() {
        return this.amount.toPlainString();
    }

    public Money add(Money other) {
        return new Money(amount.add(other.amount), other.currency);
    }

    public Money substract(Money other) {
        return new Money(amount.subtract(other.amount), other.currency);
    }
}
