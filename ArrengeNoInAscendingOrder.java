import java.util.Scanner;

public class ArrengeNoInAscendingOrder {
    public static void main(String[] args) {
        Scanner art = new Scanner(System.in);
        System.out.println("Enter the number of Elements:");
        int n = art.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = art.nextInt();

        }

        for (int j = 0; j <= n; j++) {
            System.out.println("The Elements are: " + arr[j]);
        }
        art.close();
    }
}
