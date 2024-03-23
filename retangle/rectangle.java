package oop_challenges.retangle;

public class rectangle 
{
    private float length;
    private float width;

    public rectangle()
    {
        length = 1.0f;
        width = 1.0f;
    }

    public rectangle(float length, float width)
    {
        this.length = length;
        this.width = width;
    }

    public float getLength() 
    {
        return length;
    }

    public void setLength(float length) 
    {
        this.length = length;
    }

    public float getWidth() 
    {
        return width;
    }

    public void setWidth(float width) 
    {
        this.width = width;
    }

    public float getArea()
    {
        return length * width;
    }

    public float getPerimeter()
    {
        return (length * 2) + (width * 2);
    }

    public String toString()
    {
        return "Rectangle[length= " + length + ", width= " + width + "]";
    }
}
