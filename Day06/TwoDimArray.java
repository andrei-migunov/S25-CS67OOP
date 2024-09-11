public class TwoDimArray {
    public static void main(String[] args) {
        int rows = 4, cols = 3;
        int[][] exams = new int[rows][cols];

        exams[3][2] = 86;
        System.out.println(exams[3][2]);

        for (int row=0; row<exams.length; row++) {
            for (int col = 0; col<exams[row].length; col++) {
                exams[row][col] = 100 - row - col;
            }
        }
        System.out.println(exams[0].length);
    }

}