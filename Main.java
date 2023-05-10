import java.util.Scanner;
import java.util.Vector;


public class Main extends Shape {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        boolean c = false;
        boolean r = false;
        int ginput = 0;
        double linput, linput2;

        while(ginput != 4) {
            System.out.println("\nPlease Choose one of the Following Options:");
            System.out.println("1. Add a Circle (Only 1 can exist at a time)");
            System.out.println("2. Add a Rectangle (Only 1 can exist at a time)");
            System.out.println("3. Display Any Entered Shapes");
            System.out.println("4. Quit");
            ginput = read.nextInt();
            switch (ginput) {
                case 1:
                    System.out.println("\nPlease Enter a Radius for the Circle: ");
                    linput  = read.nextInt();
                    circle = new Circle(linput);
                    c = true;
                    break;
                case 2:
                    System.out.println("\nPlease Enter a Width for the Rectangle: ");
                    linput  = read.nextInt();
                    System.out.println("Please Enter a Height for the Rectangle: ");
                    linput2  = read.nextInt();
                    rectangle = new Rectangle(linput, linput2);
                    r = true;
                    break;
                case 3:
                    if(c == true && r == true) {
                        System.out.println("\n" + circle.toString());
                        System.out.println(rectangle.toString());
                        break;
                    }
                    if(c == true){
                        System.out.println("\n" + circle.toString());
                        break;
                    }
                    if(r == true){
                        System.out.println("\n" + rectangle.toString());
                        break;
                    }
                    System.out.println("No Shape has Been Added to the Program");
                    break;
            }
        }
        System.out.println("\nThank you for Using the Shape Program");
    }
}
