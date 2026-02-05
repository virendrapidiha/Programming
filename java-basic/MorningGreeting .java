import java.util.Scanner;

public class MorningGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender (M/F): ");
        char ch = sc.next().charAt(0);

        if (ch == 'M' || ch == 'm') {
            System.out.println("Good Morning sir");
        } 
        else if (ch == 'F' || ch == 'f') {
            System.out.println("Good Morning Maam");
        } 
        else {
            System.out.println("Wrong Input");
        }

        sc.close();
    }
}
