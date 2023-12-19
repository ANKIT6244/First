import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the to find the number in decending order:");
        int i = scan.nextInt();
        System.out.println("The number is: ");
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);
        scan.close();
    }
}