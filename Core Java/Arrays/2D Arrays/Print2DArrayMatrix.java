public class Print2DArrayMatrix {
    public static void main(String[] args) {
        int[][] marks = {
            {80, 90, 85},
            {75, 88, 92}
        };

        for(int row = 0; row < marks.length; row++) {
            for(int column = 0; column < marks[row].length; column++) {
                System.out.print(marks[row][column] + " ");
            }
            
            System.out.println();
        }
    }
}
