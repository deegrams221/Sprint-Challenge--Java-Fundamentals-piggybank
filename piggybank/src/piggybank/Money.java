package piggybank;

public abstract class Money
{
    // fields
    public String count;

    // constructor
    public Money(int count) 
    {
        this.count = count;
    }

    public Money() 
    {
        count = 1;
    }

    // methods
    public abstract String getCount();

    public abstract double getValue();
}