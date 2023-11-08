import java.util.Scanner;

public class DiamondAlps1 {

    private static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        System.out.print("Enter Diamond Pattern of Alphabets Rows = ");
        int rows = sc.nextInt();

        System.out.println("Printing Diamond Alphabets Pattern\n");
        int i, j, k, alphabet = 64;

        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i * 2 - 1; k++) {
                System.out.print((char) (alphabet + k));
            }
            System.out.println();
        }

        for (i = rows - 1; i > 0; i--) {
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i * 2 - 1; k++) {
                System.out.print((char) (alphabet + k));
            }
            System.out.println();
        }
    }
}