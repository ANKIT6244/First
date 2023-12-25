public class AscendingOrder {
    public static void main(String[] args) {
        int A = 20;
        int B = 34;
        int C = 56;
        int D;
        if (A > B) {
            D = A;
        } else {
            D = B;
        }
        if (D < C) {
            D = C;
        }
        System.out.println(D);
    }
}
