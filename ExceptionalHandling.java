public class ExceptionalHandling {
    public static void main(String[] args) {
        System.out.println("Start Program.");
        int[] Array = { 8, 9, 15, 35, 95, 76 };
        try {
            System.out.println(Array[35]);
        } catch (ArrayIndexOutOfBoundsException Exception) {
            System.out.println(Exception);
        } finally {
            System.out.println("The finally block is Always Executed.");
        }
        System.out.println("Program End.");
    }
}
