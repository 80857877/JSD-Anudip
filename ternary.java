
import java.util.Scanner;

public class Oddeven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + result);
        sc.close();
    }
}
