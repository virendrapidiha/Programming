import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);

        if (gender == 'M' || gender == 'm') {
            System.out.println("Good Morning Sir");
        } else if (gender == 'F' || gender == 'f') {
            System.out.println("Good Morning Ma'am");
        } else {
            System.out.println("Invalid gender input");
        }

        sc.close();
    }
}
