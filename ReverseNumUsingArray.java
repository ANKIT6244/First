import java.util.Scanner;

public class ReverseNumUsingArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        int[] arr = new int[3];
        int digit;

        for (int i = 0; num != 0; i++) {
            digit = num % 10;
            arr[i] = digit;
            num = num / 10;
        }

        System.out.println("The Reverse number is: " + arr[0] + "" + arr[1] + "" + arr[2]);
        scan.close();
    }
}
