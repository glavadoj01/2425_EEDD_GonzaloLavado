import org.joda.money.Money;

public class Product {
    private String name;
    private Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Money getPrice() {
        return price;
    }
    public void setPrice(Money price) {
        this.price = price;
    }

    public Money applyDiscount(Money price, double percentage) {
        return Money.of(price.getCurrencyUnit(), price.getAmount().doubleValue()*(1-percentage));
    }

}
