import java.util.Scanner;

public class DisplayPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int number = sc.nextInt();
        double ans = Math.pow(number, 2);
        System.out.printf("The Square of the number: %.0f\n", ans);
        ans = Math.pow(number, 3);
        System.out.printf("The Square of the number: %.0f\n", ans);
        ans = Math.pow(number, 4);
        System.out.printf("The Square of the number: %.0f\n", ans);


    }
}
