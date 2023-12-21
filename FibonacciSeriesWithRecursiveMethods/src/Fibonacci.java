import java.util.Scanner;

public class Fibonacci {
    static int fib(int number) {
        // if kullanarak programı fazla çalıştırarak hat almaktan kaçınıyorum.
        if (number == 1 || number ==2) {
            return 1;
        }
        // fibonacci serimi oluşturmak için bu formülü kullandım.
        return fib(number - 1) + fib(number - 2);
    }

    public static void main(String[] args) {
        // Kullanıcıdan sayı girmesini isteyerek fibonacci serimin hesaplanacağı sayıyı aldım.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
// ekrana çıktısını verdim.
        System.out.println(number + " sayısının fibonacci serisinin sonucu " + fib(number) + "'dir.");

    }

}

