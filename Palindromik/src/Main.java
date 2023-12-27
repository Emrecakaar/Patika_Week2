import java.util.Scanner;

public class Main {


    static boolean isPalindrome(String word) {//Strin wordu karşılaştırmak için boolean oluşturup reverse ile karşılaştırıyorum.

        String reverse = "";
        int counter = word.length() - 1;//Sayacı sondan alıp word un bütün değerlerini gezeceğim

        while (counter >= 0) {//Diziler 0 dan başladığı için while döngüsü içinde counter ı 0 büyük eşittir uyguladım.
            reverse += word.charAt(counter);// reverse birleştiriliyor
            counter--;

            }
        return word.equals(reverse);//reverse 'ü true false içerisine attım.
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Polindromik olup olmadığını sorgulamak istediğiniz kelimeyi giriniz : ");
        String word = input.nextLine();//Kullanıcıdan girdi alıyorum.


        System.out.println("Girdiğiniz kelime " + word);

        if (isPalindrome(word)) {//Attığım true false içinde ki reverse true ise polindromik değilse değil türünde yazdırdım.
            System.out.println(word + " kelimesi bir \"polindromik\" kelimedir.");
        } else {
            System.out.println(word + " kelimesi bir \"polindromik\" kelime değildir.");
        }

    }
}