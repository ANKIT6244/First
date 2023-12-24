public class SimpleIntrestWithReturn {
    public static void main(String[] args) {
        double si1 = CalculateIntrest(10000, 8.5f, 2);
        System.out.println(si1);
        double si2 = CalculateIntrest(20000, 10.5f, 4);
        System.out.println(si2);
        double si3 = CalculateIntrest(1500000, 12.5f, 6);
        System.out.println(si3);
    }

    public static double CalculateIntrest(int principle, float RateOfIntrest, int TimePeriod) {
        double si = principle * RateOfIntrest * TimePeriod / 100;
        return si;
    }
}
