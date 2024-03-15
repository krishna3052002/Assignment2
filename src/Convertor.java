import java.util.Scanner;
public class Convertor {
    public static final double mile= 1609.344;
    public static final double feet=0.305;
    public static final double inches=39.37;

    public double ConvertMile(double meter)
    {
        return meter/ mile ;
    }
    public double ConvertFeet(double meter)
    {
        return meter / feet ;
    }
    public double ConvertInches(double meter)
    {
        return meter * inches ;
    }
    public static void main(String[] args)
    {
        Convertor convertor1=new Convertor();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The value in Meter:");
        double a= sc.nextDouble();
        System.out.printf("Mile:         %.2f\n",convertor1.ConvertMile(a));
        System.out.printf("Feet:         %.2f\n",convertor1.ConvertFeet(a));
        System.out.printf("Inches:       %.2f\n",convertor1.ConvertInches(a));


    }

}
