import java.util.Scanner;

public class PrimeNumbers {
    static boolean primeNumbers(int number, int divisor) {
        if (divisor <= 1) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        } else {
            return primeNumbers(number, divisor - 1);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kontrol etmek istediğiniz sayıyı giriniz : ");
        int number = input.nextInt();

        if (primeNumbers(number, number - 1)) {
            System.out.println(number + " sayısı bir asal sayıdır.");
        } else {
            System.out.println(number + " sayısı bir asal sayı değildir.");
        }


    }
}
