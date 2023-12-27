import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);//Random bir sayı oluşturuyorum.
        int[] wrong = new int[5];
        boolean isWrong = false;


        int right = 0;
        while (right < 5) {//Kullanıcıya 5 hak sunuyorum.
            System.out.println("Sayıyı tahmin ediniz : ");
            int number = input.nextInt();

            if (number < 0 || 99 < number) {//Kullanıcı 0 ile 100 arasında bir sayı girmezse kullanıcıdan tekrar girmesini istiyorum.
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz");
                if (isWrong) {//Kullanıcı tekrar hatalı giriş yaparsa hakkından düşüyorum.
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (4 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (number == randomNumber) {//Kullanıcının girdiği sayı doğru ise kazandığını gösteriyorum.
                System.out.println("Tebrikler doğru bildiniz!");
                break;
            } else {
                System.out.println("Tekrar deneyiniz.");
                System.out.println("Kalan hakkınız : " + (4 - right));
            }
            wrong[right] = number;
            right++;
            if (right == 5) {//Kullanıcı hakkını bitirene kadar yanlış girdiyse kaybettiğini belirtiyorum.
                System.out.println("Kalan hakkınız bitmiştir! GAME OVER!!!");
            }
        }
        Arrays.sort(wrong);
        if (!isWrong) {//Kullanıcı bütün hakkını yanlış girdikten sonra kullanıcıya girdiği değerleri ve olması gereken değeri yazdırıyorum.
            System.out.println("Yanlış girdiğiniz değerler : " + " " + Arrays.toString(wrong));
            System.out.println("Sayımız : " + randomNumber + " sayısı olması gerekti.");

        }
    }
}