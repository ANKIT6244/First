public class TwoDArraySum {
    public static void main(String[] args) {
        int[][] My2DArray = {
                { 3, 4, 5, 6 },
                { 7, 8, 9, 19 },
                { 20, 22, 23, 25 },
                { 30, 40, 50, 60 }
        };
        int sum = 0;
        for (int row = 0; row < My2DArray.length; row++) {
            System.out.println();
            for (int column = 0; column < My2DArray.length; column++) {
                sum += My2DArray[row][column];
                System.out.print(My2DArray[row][column] + ", ");
            }
        }
        System.out.println("SUM is:" + sum);
    }
}
