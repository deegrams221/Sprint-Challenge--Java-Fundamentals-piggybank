package piggybank;

public abstract class AbstractMoney 
{
    // fields
    private int count;
    private double value;

    // constructor
    public AbstractMoney(int count, double value) 
    {
        this.count = count;
        this.value = value;
    }

    // abstract methods
    public abstract int count();
    public abstract double value();
} 