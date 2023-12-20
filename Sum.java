import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        long i;
        long sum = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter the number to sum:");
            i = scan.nextLong();
            sum = sum + i;
            System.out.println("SUM IS: " + sum);
        } while (i != 0);
        scan.close();
    }
}
