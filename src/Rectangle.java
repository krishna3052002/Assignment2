import java.util.Scanner;
public class Rectangle {
    public double Area(double l,double w)
    {
        return l * w;
    }

    public double Perimeter(double l, double w)
    {
        return 2* (l+w);
    }
    public double LengthOfDiagonal(double l,double w)
    {
        double y=Math.pow(l,2) + Math.pow(w,2);
        return Math.sqrt(y);
    }

    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       Rectangle rectangle1= new Rectangle();
       System.out.printf("Enter Length:");
       double l=sc.nextDouble();
       System.out.printf("Enter Width:");
       double w=sc.nextDouble();
       System.out.printf("Area:                          %.2f\n",rectangle1.Area(l,w));
       System.out.printf("Perimeter:                     %.2f\n",rectangle1.Perimeter(l,w));
       System.out.printf("Length Of Diagonal:            %.2f\n",rectangle1.LengthOfDiagonal(l,w));


    }
}
