import java.util.Scanner;
public class E9CostPerMile {
    public static final double per100Mile=100.0;
    public double CostPer100Mile(double milesPerGallon ,double pricePerGallon)
    {
        return (per100Mile/milesPerGallon)* pricePerGallon;
    }
    public double CanGo(int numberOfGallons, double milesPerGallon)
    {
        return numberOfGallons * milesPerGallon;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        E9CostPerMile cost1= new E9CostPerMile();
        System.out.printf("The number of gallons of gas in the tank:");
        int numberOfGallons= sc.nextInt();
        System.out.printf("The fuel efficiency in miles per gallon:");
        double milesPerGallon= sc.nextInt();
        System.out.printf("The price of gas per gallon:");
        double pricePerGallon= sc.nextInt();
        System.out.printf("Cost Per 100 Miles: %.2f\n",cost1.CostPer100Mile(milesPerGallon,pricePerGallon));
        System.out.printf("How far the car can go: %.2f\n",cost1.CanGo(numberOfGallons,milesPerGallon));
    }
}
