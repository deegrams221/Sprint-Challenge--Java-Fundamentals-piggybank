package piggybank;

public abstract class AbstractMoney
{
    // fields
    int count;

    // constructors
    public AbstractMoney(int count) 
    {
        this.count = count;
    }

    public AbstractMoney() 
    {
        count = 1;
    }

    // abstract methods
    public abstract String getCount();
    public abstract double getTotal();
} 