public class ExceptionalHandling {
    public static void main(String[] args) {
        System.out.println("Start Program.");
        int[] Array = { 8, 9, 15, 35, 95, 76 };
        try {
            int result = 67 / 0;
            System.out.println(Array[32665]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException Exception) {
            System.out.println(Exception);
        } finally {
            System.out.println("The finally block is Always Executed.");
            System.out.println(Array[0]);
        }
        System.out.println("Program End.");
        System.out.println(Array[2]);
    }
}
