public class SumArray {
    public static void main(String[] args) {
        int i = 0;
        int[] FirstArray = { 56, 87, 90, 12 };
        int sum = 0;
        for (i = 0; i < FirstArray.length; i++) {
            sum += FirstArray[i];
            System.out.println(FirstArray[i]);
            System.out.println("The sum of Array is: " + sum);
        }
    }
}