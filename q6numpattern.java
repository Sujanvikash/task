import java.util.Scanner;

public class q6numpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print(n - j);
                } else {
                    System.out.print(n - i);
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
