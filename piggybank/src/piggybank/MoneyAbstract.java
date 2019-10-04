package piggybank;

import java.math.BigDecimal;

public abstract class MoneyAbstract
{
    int count = 1;
    double moneyValue;

    public MoneyAbstract(int count)
    {
        this.count = count
    }

    // methods: getters/setters
    public int getCount()
    {
        return count;
    }

    public int setCount(int count)
    {
        this.count = count;
    }

    public double getValue()
    {
        return moneyValue * count;
    }

    public double setValue(int value)
    {
        this.value = value;
    }

    public double getMoneyValue()
    {
        return moneyValue;
    }

    public double setMoneyValue(double moneyValue)
    {
        this.moneyValue = moneyValue;
    }

    // abstract methods
    public abstract String strValue();
    public abstract String strValueInc();
}