import java.util.Arrays;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static boolean isFind(int[] arr, int value) {// Aldığımız çıktıda sürekli sayı tekrar etmesini istemediğim için bu methodu oluşturdum.
        for (int first : arr) {
            if (first == value) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] list = {15, 14, 18, 19, 21, 22, 24, 38, 102, 18, 888, 37, 21, 15, 38, 15};
        int[] duplicate = new int[list.length];
        int startindex = 0;

        for (int first = 0; first < list.length; first++) {
            for (int second = 0; second < list.length; second++) {

                if ((first != second) && list[first] == list[second]) {
                    if (!isFind(duplicate, list[first])) {
                        duplicate[startindex++] = list[first];
                    }
                    break;
                }
            }
        }
        for (int value : duplicate) {// kalan sayıları çıktımda 0 olarak göstermesini engelledim.
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}