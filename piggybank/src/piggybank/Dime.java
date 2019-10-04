package piggybank;

public class Dime extends Money
{
    // fields
    // private int count;
    // private double value;

    // constructor
    public Dime()
    {
        super();
    }

    // pass in method from Money
    public Dime(int count)
    {
        super(count);
    }

    // from Money
    @Override
    public String getValue()
    {
        return count * 0.10;
    }

    @Override
    public String getCount()
    {
        if (count == 1)
        {
            return count + " Dime";
        } else 
        {
            return count + " Dimes";
        }
    }

    // @Override
    // public String toString()
    // {
    //     return "Dime{" +
    //             "name='" + name + '\'' +
    //             ", count=" + count + 
    //             '}';
    // }
}