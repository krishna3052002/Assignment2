import java.util.Scanner;
public class Operations {


    public Operations() {

    }

    //
    int summation(int a,int b)
    {
        return a+b;
    }
    int multiplication(int a,int b){
        return a*b;
    }
    int difference(int a,int b)
    {
        if(a>b)
        {
            return a-b;
        }
        else
        {
            return b-a;
        }
    }
    float avrg(int a,int b)
    {
        return (float)(a+b)/2;
    }
    int distance(int a,int b)
    {
        return Math.abs(a-b);
    }
    int maximum(int a,int b)
    {
        return Math.max(a,b);
    }
    int minimum(int a,int b){
        return Math.min(a,b);
    }
    public static void main(String[] args)
    {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter First Number:");
        int a=sc.nextInt();
        System.out.println("Enter Second Number:");
        int b=sc.nextInt();
        Operations operation1= new Operations();

        System.out.printf("The Sum Value: %d\n",operation1.summation(a,b));
        System.out.printf("The Multiplied Value: %d\n",operation1.multiplication(a,b));
        System.out.printf("The Difference is : %d\n",operation1.difference(a,b));
        System.out.printf("he Average value is : %.2f\n",operation1.avrg(a,b));
        System.out.printf("The Distance value is : %d\n",operation1.distance(a,b));
        System.out.printf("The Maximum Value : %d\n",operation1.maximum(a,b));
        System.out.printf("The Minimum Value : %d\n",operation1.minimum(a,b));

    }
}
