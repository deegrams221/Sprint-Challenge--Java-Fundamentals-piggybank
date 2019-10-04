package piggybank;

public abstract class Money
{
    // fields
    private String count;
    private double value;

    // constructor
    public Money(String count, double value) 
    {
        this.count = count;
        this.value = value;
    }

    // methods
    public String getCount()
    {
        return count;
    }

    public int count() 
    {
        return count;
    }

    public double value()
    {
        return value;
    }

}