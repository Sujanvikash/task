import java.util.Scanner;

public class q5DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        double discountAmount = (discountPercentage / 100) * purchaseAmount;

        double finalAmount = purchaseAmount - discountAmount;

        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Payable Amount: " + finalAmount);

        scanner.close();
    }
}
