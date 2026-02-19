import java.util.Scanner;

class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
