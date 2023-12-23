public class SimpleIntrest {
    public static void main(String[] args) {
        /* Simple intrest = principle * rate of intrest * timeperiod /100 */
        /* User 1: p = 10000 , ROI = 8.5f , T = 2 years */
        CalculateIntrest(10000, 8.5f, 2);
        CalculateIntrest(20000, 10.5f, 2);
    }

    public static void CalculateIntrest(int Principle, float RateOfIntrest, int TimePeriod) {
        double si = Principle * RateOfIntrest * TimePeriod / 100;
        System.out.println(si);
    }
}
