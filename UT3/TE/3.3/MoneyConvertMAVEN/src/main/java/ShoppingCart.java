import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> carroActual;
    private final List<Double> dtos;
    private static final double convertDollars = 0.85;

    public ShoppingCart() {
        this.carroActual = new ArrayList<>();
        this.dtos = new ArrayList<>();
    }

    public List<Product> getCarroActual() {
        return carroActual;
    }
    public List<Double> getDtos() {
        return dtos;
    }

    public void adding(Product product, double percentage) {
        this.carroActual.add(product);
        this.dtos.add(percentage);
    }
    public void erase(Product product) {
        this.dtos.remove(carroActual.indexOf(product));
        this.carroActual.remove(product);
    }

    public Money total0() {
        double total = 0;
        for (Product p : carroActual) {
            if (p.getPrice().getCurrencyUnit() == CurrencyUnit.USD) {
                total += p.getPrice().getAmount().doubleValue();
            }else {
                total += CurrencyConverterMAVEN.convert(p.getPrice(),CurrencyUnit.USD, convertDollars).getAmount().doubleValue();
            }
        }
        return Money.of(CurrencyUnit.USD, total);
    }

    public Money totalDto() {
        double total = 0;
        int cont = 0;
        for (Product p : carroActual) {
            if (p.getPrice().getCurrencyUnit() == CurrencyUnit.USD) {
                total += p.applyDiscount(p.getPrice(),dtos.get(cont)).getAmount().doubleValue();
            }else {
                total += p.applyDiscount(CurrencyConverterMAVEN.convert(p.getPrice(),CurrencyUnit.USD,convertDollars) ,dtos.get(cont)).getAmount().doubleValue();
            }
            cont++;
        }

        return Money.of(CurrencyUnit.USD, total);
    }
}
