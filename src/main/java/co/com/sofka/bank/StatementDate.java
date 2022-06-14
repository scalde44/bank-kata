package co.com.sofka.bank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class StatementDate {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final LocalDate date;
    private final String format;

    private StatementDate(String date) {
        Objects.requireNonNull(date);
        if (date.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.date = LocalDate.parse(date, DATE_TIME_FORMATTER);
        this.format = generateFormat();
    }

    public static StatementDate dateOf(String date) {
        return new StatementDate(date);
    }

    private String generateFormat() {
        return date.format(DATE_TIME_FORMATTER);
    }

    public String value() {//(3)
        return format;
    }
}
