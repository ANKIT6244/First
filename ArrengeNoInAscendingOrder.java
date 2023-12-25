import java.util.Scanner;

public class ArrengeNoInAscendingOrder {
    public static void main(String[] args) {
        Scanner art = new Scanner(System.in);
        System.out.println("Enter the number of Elements:");
        int n = art.nextInt();
        System.out.println("Enter the Elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = art.nextInt();
        }
        int D = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i + 1] = arr[i];
            } else {
                arr[i + 1] = arr[i + 1];
            }
        }
        System.out.println("The greatest No : " + arr[n - 1]);

        // for (int j = 0; j <= n; j++) {
        // System.out.println("The Elements are: " + arr[j]);
        // }
        art.close();
    }
}
