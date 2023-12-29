import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        System.out.println("   Tax Calculator App    ");
        System.out.println("_________Welcome_________");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total Person Count:");
        int n = scan.nextInt();
        String[] arr = new String[n];
        Long[] arry = new Long[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Name:");
            String name = scan.nextLine();
            arr[i] = name;
            /*
             * System.out.println("Enter the " + arr[i] + " Income:");
             * Long income = scan.nextLong();
             * arry[i] = income;
             */
        }
        scan.close();
    }
}
