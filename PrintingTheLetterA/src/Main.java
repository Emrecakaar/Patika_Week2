//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[6][4];

        for (int first = 0; first < letter.length; first++){
            for (int second = 0; second < letter[first].length; second++ ){
                if (first == 0 || first == 2){
                    letter[first][second] = " * ";
                } else if (second == 0 || second == 3){
                    letter[first][second] = " * ";
                } else {
                    letter[first][second] = "   ";
                }
            }
        }
        for (String[] row : letter){
            for (String colmn : row){
                System.out.print(colmn);
            }
            System.out.println();
        }
    }
}