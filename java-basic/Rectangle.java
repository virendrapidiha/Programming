import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter width: ");
        int width = sc.nextInt();

        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);

        sc.close();
    }
}
