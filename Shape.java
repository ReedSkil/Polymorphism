public abstract class Shape {
    double pi = 3.14159265359;
    double area;
    double perimeter;

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public String toString() {
        return "Area: " + area + ", Perimeter: " + perimeter;
    }
}
