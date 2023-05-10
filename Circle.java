public class Circle extends Shape{
    double radius;
    double temp;

    public Circle() {}

    public void setArea(){
        temp = pi * (radius * radius);
        setArea(temp);
    }
    public void setPerimeter(){
        temp = 2.0 * pi * radius;
        setPerimeter(temp);
    }

    public Circle(double radius) {
        this.radius = radius;
        setArea();
        setPerimeter();
    }


    @Override
    public String toString() {
        return "Circle, Radius: " + radius + ", " + super.toString();
    }
}
