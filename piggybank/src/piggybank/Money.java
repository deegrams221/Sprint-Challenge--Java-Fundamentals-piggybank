package piggybank;

public abstract class Money
{
    // fields
    public String count;
    public double faceValue;

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
    public double getFaceValue()
    {
        return faceValue;
    }

    public int getIntCount()
    {
        return count;
    }

    public void setIntCount(int count)
    {
        this.count = count;
    }

    public abstract String getCount();

    public abstract double getValue();
}