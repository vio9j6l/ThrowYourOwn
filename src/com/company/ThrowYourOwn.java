package com.company;

class Circle
{
    private double m_radius;

    public Circle(double r) throws NegativeRadiusException
    {
        if (r < 0)
            throw new NegativeRadiusException(r);
        m_radius = r;
    }
}

class NegativeRadiusException extends Exception
{
    public NegativeRadiusException(double r)
    {
        super("Negative radius not allowed: " + r);
    }
}

public class ThrowYourOwn
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            Circle good = new Circle(10);
            System.out.println("Created a circle with radius 10");

            Circle bad = new Circle(-36);
            System.out.println("Created a circle with radius -36");

        }
        catch (NegativeRadiusException nre)
        {
            System.out.println(nre.getMessage());
        }
    }
}

