package piggybank;

import java.math.BigDecimal;

public abstract class MoneyAbstract
{
    // fields
    String name;
    int count = 1;
    double moneyValue;

    public MoneyAbstract(String name, int count)
    {
        this.name = name;
        this.count = count;
    }

    // methods
    public String getName()
    {
        return name;
    }

    public int getCount()
    {
        return count;
    }

    public double getMoneyValue()
    {
        return moneyValue;
    }

    public double getValue()
    {
        return moneyValue * count;
    }

    // abstract methods
    public abstract String strValue();
    public abstract String strValueInc();
}