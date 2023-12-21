import java.util.Scanner;

public class Polindrom {
    // boolean veri tipi; isPolindrom metot adı ile istediğim sonuca ulaştığımda ekrana doğru yazmasını amaçladım.
    static boolean isPolindrom(int number) {
        // number değişkenimi temp ile eşitleyerek true false da hata almaktan kaçtım.

        int temp = number, reverseNumber = 0, lastNumber;
// döngüm temp = 0 olduğu zaman dursun istedim.
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;

        }
        return (reverseNumber == number) ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        if (isPolindrom(number)) {
            System.out.println(number + " sayısı bir polindromdur.");
        } else {
            System.out.print(number + " sayısı bir polindrom değildir.");
        }
    }
}