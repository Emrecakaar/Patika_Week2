public class Main {
    public static void main(String[] args) {

        int[][] matrix = {{2, 3, 4}, {5, 6, 7}};
        int[][] list = new int [3][2];

        for(int first = 0; first < 2; first++){
            for (int second = 0; second < 3; second++){
                System.out.print(matrix[first][second] + "  ");
            }
            System.out.println();
        }
        System.out.println("=====================");
        for(int first1 = 0; first1 < 3; first1++ ){
            for(int second1 = 0; second1 < 2; second1++){

                list [first1][second1] = matrix[second1][first1];
                System.out.print(list[first1][second1] + " ");
            }
            System.out.println();
        }

    }
}