package com.softmar.MoneyConvert;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class CurrencyConverter {
    public static Money convert(Money amount, CurrencyUnit targetCurrency, double rate) {
        double convertedAmount = amount.getAmount().doubleValue() * rate;
        return Money.of(targetCurrency, convertedAmount);
    }

    public static Money addMoney(Money m1, Money m2) {
        if (m1.getCurrencyUnit().equals(m2.getCurrencyUnit())) {
            return Money.of(m1.getCurrencyUnit(), m1.getAmount().add(m2.getAmount()));
        }
        return null;
    }

    public static Money subtractMoney(Money m1, Money m2) {
        if (m1.getCurrencyUnit().equals(m2.getCurrencyUnit())) {
            return Money.of(m1.getCurrencyUnit(), m1.getAmount().subtract(m2.getAmount()));
        }
        return null;
    }

    public static int compareAmounts(Money m1, Money m2) {
        if (m1.getCurrencyUnit().equals(m2.getCurrencyUnit())) {
            if (m1.getAmount().doubleValue() > m2.getAmount().doubleValue()) {
                return 1;
            }
            else if (m1.getAmount().doubleValue() < m2.getAmount().doubleValue()) {
                return -1;
            }
            return 0;
        }
        return -9;
    }
}
