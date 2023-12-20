import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        scan.close();
        int i, cf = 1;
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                cf++;
                if (cf > 3) {
                    break;
                }
            }
        }
        if (cf == 3) {
            System.out.println("It is Prime no.");
        } else {
            System.out.println("Not prime number.");
        }
    }
}