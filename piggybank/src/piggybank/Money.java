package piggybank;

public abstract class Money
{
    int count;

    public Money(int count) 
    {
        this.count = count;
    }

    public Money() 
    {
        count = 1;
    }

    // abstract methods
    public abstract String getCount();
    public abstract double getValue();
}