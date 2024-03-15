import java.util.Scanner;
public class Circle {
    public static final double pi=3.1416;
    public static final double fourByThree= (float)4/3;
    public double Area(double radius)
    {
        return pi * Math.pow(radius,2);
    }
    public double Circumference(double radius)
    {
        return 2* pi * radius;
    }
    public double SphereVolume(double radius)
    {
        return fourByThree * pi * Math.pow(radius,3);
    }
    public double SphereSurfaceArea(double radius)
    {
        return 4 * pi * Math.pow(radius,2);
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        Circle circle1= new Circle();
        System.out.println("Enter Radius:");
        double radius= sc.nextDouble();
        System.out.printf("Area:                   %.2f\n",circle1.Area(radius));
        System.out.printf("Circumference:          %.2f\n",circle1.Circumference(radius));
        System.out.printf("Sphere Volume:          %.2f\n",circle1.SphereVolume(radius));
        System.out.printf("Sphere Surface Area:    %.2f\n",circle1.SphereSurfaceArea(radius));


    }
}
