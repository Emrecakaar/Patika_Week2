//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] list = {58, -35, 5, 10, -100, 9};

        int min = list[0];//minimum değişkenimi ilk sayıya eşitledim
        int max = list[0];//maximum değişkenimi ilk sayıya eşitledim

        for (int finder : list){// finder değişkenimi liste eşitleyerek min ve max değerleri bulmayı hedefliyorum.
            if (min > finder){
                min = finder;
            }
            if(max < finder){
                max = finder;
            }
        }
        System.out.println("Minimum değer : " + min);// minimum değer
        System.out.println("Maximum değer : " + max);// maximum değer
    }
}