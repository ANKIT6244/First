public class SumOfArray {
    public static void main(String[] args) {
        float[] flor = new float[4];
        flor[0] = 20.5f;
        flor[1] = 30.5f;
        flor[2] = 40.5f;
        flor[3] = 50.5f;
        float SumOfNo = 0;
        for (float sum : flor) {
            SumOfNo += sum;
            System.out.println("The sum is:" + SumOfNo);
        }
    }
}
