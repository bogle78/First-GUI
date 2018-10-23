
package lab5d;


public class Circle extends Shape{
       
    private double radius;
    private double circumference;
    
    
    
    public Circle(int x,int y, int z, double newRadius) {
        super(x,y,z);
        this.radius = newRadius;
    }
    
    
    @Override
    public String toString() {
        return ("(" + super.getX() + "," + super.getY() + ") : " + "( " + area() + " )");
        
    }
    
    @Override
    public double area() {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius >= 0)
            this.radius = radius;
    }
    public double getCircumference() {
        circumference = 2*Math.PI*radius;
        return (circumference);
    } 
    
}
