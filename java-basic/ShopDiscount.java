import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        int amount = sc.nextInt();

        double discount;
        double finalAmount;

        if (amount >= 5000) {
            discount = amount * 0.20;
        } else if (amount >= 3000) {
            discount = amount * 0.10;
        } else {
            discount = 0;
        }

        finalAmount = amount - discount;

        System.out.println("Discount: " + discount);
        System.out.println("Final Amount to Pay: " + finalAmount);
    }
}
