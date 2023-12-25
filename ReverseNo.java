import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner Scaner = new Scanner(System.in);
        System.out.println("Enter the three Digit Number:");
        int x = Scaner.nextInt();
        if (x >= 99 && x <= 1000) {
            int A = x % 10;
            int B = (x / 10) % 10;
            int C = ((x / 10) / 10) % 10;
            int D = A * 100 + B * 10 + C;
            System.out.println("The Number is:" + D);
        } else {
            System.out.println("Please Enter 3 Digit Number.");
        }
    }

}
