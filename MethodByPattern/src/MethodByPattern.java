import java.util.Scanner;

public class MethodByPattern {
    static void printPattern(int number1,int number2, boolean isMethod) {

        if (number1 > 0 && isMethod) {
            System.out.print(number1 + " ");
            printPattern(number1 - 5,number2, true);
        } else if (number1 <= 0) {
            System.out.print(number1 + " ");
            printPattern(number1 + 5,number2, false);
        } else if (number1 > 0 && number1 <= number2 && !isMethod)  {
            System.out.print(number1 + " ");
            printPattern(number1 + 5,number2, false);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number1 = input.nextInt();

        printPattern(number1, number1, true);
    }
}
