public class DisplayProperties {
    public static final double per_inch= 25.4;
    public static final double length = 11.0* per_inch;
    public static final double weidth= 8.5 * per_inch;

    public double weidth()
    {
        return weidth;
    }
    public double length()
    {
        return length;
    }
    public double perimeter()
    {
        return 2*(length + weidth);
    }

    public double lengthOfDiagonal()
    {
        double w= Math.pow(weidth,2);
        double l= Math.pow(length,2);
        return Math.sqrt(w+l);
    }
    public static void main(String[] args)
    {
        DisplayProperties rectangle1= new DisplayProperties();
        System.out.printf("The Width : %.2f\n",rectangle1.weidth());
        System.out.printf("The Height : %.2f\n",rectangle1.length());
        System.out.printf("The perimeter: %.2f\n",rectangle1.perimeter());
        System.out.printf("The length of Diagonal: %.2f\n",rectangle1.lengthOfDiagonal());

    }


}
