package com.softmar.MoneyConvert;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class Main {
    public static void main(String[] args) {
        // Definir cantidades en diferentes monedas
        Money usdAmount = Money.of(CurrencyUnit.USD, 100);
        CurrencyUnit eur = CurrencyUnit.EUR;

        // Tipo de cambio ficticio (1 USD = 0.85 EUR)
        double exchangeRate = 0.85;

        // Realizar conversión
        Money eurAmount = CurrencyConverter.convert(usdAmount, eur, exchangeRate);

        // Mostrar resultado
        System.out.println(usdAmount + " equivale a " + eurAmount);


        // Apartado 3
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.adding(new Product("Laptop", Money.of(CurrencyUnit.USD, 1200.0)), 0.1);
        shoppingCart.adding(new Product("Smartphone", Money.of(CurrencyUnit.USD, 800.0)), 0.2);
        shoppingCart.adding(new Product("Auriculares", Money.of(CurrencyUnit.USD, 150.0)), 0);

        int cont = 0;
        for (Product p : shoppingCart.getCarroActual()) {
            System.out.print("\nProduct: " + p.getName() + " - Precio original: " + p.getPrice() + " - ");
            if (shoppingCart.getDtos().get(cont) != 0) {
                System.out.print("Precio con descuento (" + (100*shoppingCart.getDtos().get(cont)) + "%): " + p.applyDiscount(p.getPrice(),shoppingCart.getDtos().get(cont)));
            }
            else {
                System.out.print("Sin descuento aplicado.");
            }
            cont++;
        }
        System.out.println("\n");
        System.out.println("Total sin descuento: " + shoppingCart.total0());
        System.out.println("Total con descuento: " + shoppingCart.totalDto());
    }
}
