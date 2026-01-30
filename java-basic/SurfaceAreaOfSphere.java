import java.util.Scanner;

public class SurfaceAreaOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the sphere: ");
        double r = sc.nextDouble();

        double surfaceArea = 4 * Math.PI * r * r;

        System.out.println("Surface Area of the Sphere = " + surfaceArea);

        sc.close();
    }
}
