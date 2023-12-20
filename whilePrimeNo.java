import java.util.Scanner;

public class whilePrimeNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        int i = 1;
        int cf = 1;
        while (i <= num) {
            if (num % i == 0) {
                cf++;
            }
            i++;
            if (cf > 3) {
                break;
            }
        }
        if (cf == 3) {
            System.out.println("It is Prime Number.");
        } else {
            System.out.println("Not Prime NUmber.");
        }
    }
}
