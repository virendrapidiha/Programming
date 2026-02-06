import java.util.Scanner;

public class VoterEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Hello " + name + ", You are a valid voter.");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("Sorry " + name + ", you can't cast the vote.");
            System.out.println("You will be eligible to vote after " + yearsLeft + " years.");
        }
    }
}
