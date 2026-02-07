import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Greatest number is " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Greatest number is " + b);
        } 
        else {
            System.out.println("Greatest number is " + c);
        }

        sc.close();
    }
}
