import java.util.Scanner;

public class PrimeNumbers {
    static boolean primeNumbers(int number, int divisor) {
        if (divisor <= 1) { // Bölen sayımız 1 veya 1 den küçük olursa program dursun istiyorum.
            return true;
        }
        if (number % divisor == 0) { // Eğer sayı bölünüyorsa false alarak asal sayı olmadığını belirliyorum.
            return false;
        } else {
            return primeNumbers(number, divisor - 1);// sayıyı 1 azaltarak asal sayının kontrolünü sağlıyorum.
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kontrol etmek istediğiniz sayıyı giriniz : ");
        int number = input.nextInt();

        if (primeNumbers(number, number - 1)) {// Burada da yaptığım işin çıktısını alıyorum.
            System.out.println(number + " sayısı bir asal sayıdır.");
        } else {
            System.out.println(number + " sayısı bir asal sayı değildir.");
        }


    }
}
