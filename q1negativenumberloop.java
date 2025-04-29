import java.util.Scanner;

public class q1negativenumberloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("\nUsing for loop:");
        for (int i = start; i <= end; i++) {
            System.out.println(-i);
        }

        System.out.println("\nUsing while loop:");
        int i = start;
        while (i <= end) {
            System.out.println(-i);
            i++;
        }

        scanner.close();
    }
}
