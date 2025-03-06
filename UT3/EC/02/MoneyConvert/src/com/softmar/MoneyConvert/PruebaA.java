package com.softmar.MoneyConvert;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class PruebaA {
    public static void main(String[] args) {
        // Definir 2 variables usd1 de moneda USD de valor 100 y otra, usd2 de valor 50
        Money usd1 = Money.of(CurrencyUnit.USD, 100);
        Money usd2 = Money.of(CurrencyUnit.USD, 50);

        // Definir un variable tipo CurrencyUnit, nombre eur y valor CurrencyUnit.EUR
        CurrencyUnit eur = CurrencyUnit.EUR;

        // Define un tipo de cambio ficticio (1 USD = 0.85 EUR). Double exchangeRate = 0.85
        double exchangeRate = 0.85;

        // Realiza la conversión usd1 a eur y almacena en variable eurAmount
        Money eurAmount = CurrencyConverter.convert(usd1, eur, exchangeRate);

        // Muestra los resultados 100 USD equivale a XX Eur
        System.out.println("\nConversión: " + usd1 + " equivalen a " + eurAmount);

        // Suma usd1 a usd2 y muestra el resultado de la suma
        System.out.println("Suma: " + CurrencyConverter.addMoney(usd1, usd2));

        // Resta usd1 a usd2 y muestra el resultado de la resta
        System.out.println("Resta: " + CurrencyConverter.subtractMoney(usd1, usd2));

        // Compara usd1 a usd2 y muestra el resultado de la comparación
        System.out.print("Comparación: " + usd1 + " es ");
        int compare = CurrencyConverter.compareAmounts(usd1, usd2);
        if (compare == 0) {
            System.out.print("igual que ");
        } else if (compare == 1) {
            System.out.print("mayor que ");
        } else if (compare == -1) {
            System.out.print("menor que ");
        } else {
            System.out.print("de una divisa diferente que ");
        }
        System.out.print(usd2);
    }
}
