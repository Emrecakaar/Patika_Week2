import java.util.Scanner;

public class MethodByPattern {
    static void printPattern(int number, boolean increasing) {
        System.out.print(number + " ");
        if (number > 0) {
            // Artarak devam et
            printPattern(number - 5, true);
        } else if (number <= 0){
            // Azalarak devam et
            printPattern(number + 5, false);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        printPattern(number, true);
    }
}
