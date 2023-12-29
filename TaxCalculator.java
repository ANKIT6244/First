import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("   Tax Calculator App    ");
        System.out.println("_________Welcome_________");

        System.out.println("Enter the total Person Count:");
        int n = scan.nextInt();

        String[] arr = new String[n];
        Long[] arry = new Long[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Name " + (i + 1) + ":");
            arr[i] = scan.nextLine();

            System.out.println("Enter the " + arr[i] + " Income:");
            arry[i] = scan.nextLong();

        }
        scan.close();
    }
}
