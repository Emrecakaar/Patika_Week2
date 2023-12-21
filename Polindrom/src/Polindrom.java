import java.util.Scanner;

public class Polindrom {
    static boolean isPalindrom(int number) {

        int temp = number, reverseNumber = 0, lastNumber;
// döngüm temp = 0 olduğu zaman dursun istedim.
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;

        }
        // reverseNumber == number olana kadar döngüm devam etsin istedim.
        return (reverseNumber == number);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
// Ekrana sayımın polindrom olduğunu yazdırıyorum.
        if (isPalindrom(number)) {
            System.out.println(number + " sayısı bir polindromdur.");
        } else {
            System.out.print(number + " sayısı bir polindrom değildir.");
        }
    }
}