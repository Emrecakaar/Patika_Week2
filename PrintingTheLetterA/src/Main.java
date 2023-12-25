//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[6][4];

        for (int first = 0; first < letter.length; first++){ //İlk önce satırı for döngüsüne bağladım.
            for (int second = 0; second < letter[first].length; second++ ){//Daha sonra sütunu for döngüsünü bağladım.
                if (first == 0 || first == 2){//Satırda oluşacak yıldızın yerlerini belirledim.
                    letter[first][second] = " * ";
                } else if (second == 0 || second == 3){//Sütunda oluşacak yıldızın yerlerini belirledim.
                    letter[first][second] = " * ";
                } else {
                    letter[first][second] = "   ";//Boşluk yerlerini belirledim.
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