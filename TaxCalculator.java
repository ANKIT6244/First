import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\n     Tax Calculator App    ");
        System.out.println(" ---------WELCOME----------");
        System.out.println("\nEnter total Person Count:");
        int n = scan.nextInt();

        String[] arr = new String[n];
        Long[] arry = new Long[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Name " + (i + 1) + " :");
            arr[i] = scan.next(); /*
                                   * For more than word use scan.nextLine(); & And for only One word use
                                   * scan.next();
                                   */

            System.out.println("Enter " + arr[i] + "'s Annual Income:");
            arry[i] = scan.nextLong();
        }
        System.out.println("\n Names with liable taxes");
        System.out.println("-----------------------------");
        System.out.println();

        for (int i = 0; i < n; i++) {
            calculateTax(arr[i], arry[i]);
        }
        scan.close();
    }

    public static void calculateTax(String name, Long income) {
        double tax = 0;
        if (income >= 300000) {
            tax = income * 20 / 100;
        } else if (income < 300000 && income >= 100000) {
            tax = income * 10 / 100;
        } else if (income < 100000) {
            tax = 0;
        }
        System.out.println(name + ": ₹" + tax);
    }
}
