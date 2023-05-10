public class Rectangle extends Shape{
    double width;
    double height;
    double temp;

    public Rectangle(){}

    public void setArea(){
        temp = width * height;
        setArea(temp);
    }
    public void setPerimeter(){
        temp = 2.0 * (width + height);
        setArea(temp);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        setArea();
        setPerimeter();
    }

    @Override
    public String toString() {
        return "Rectangle, Height: " + height + ", Width: " + width + ", " + super.toString();
    }
}
