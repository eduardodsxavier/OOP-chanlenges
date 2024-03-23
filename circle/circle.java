package oop_challenges.circle;

public class circle 
{
    private double radius;

    public circle()
    {
        radius = 1.0;
    }

    public circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return radius * radius * Math.PI;
    }

    public double getCircumference()
    {
        return (radius + radius) * Math.PI;
    }

    public String toString()
    {
        return "Circle[radius= " + radius + "]";
    }
}
