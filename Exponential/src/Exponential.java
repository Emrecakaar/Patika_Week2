import java.util.Scanner;

public class Exponential {
    static int mathematic(int base, int power) {
        if (power == 0) {//Power sıfır olunca bir sayının 0 kuvveti 1'dir mantığıyla ilerledim.
            return 1;
        } else {// Burada power'ı her seferinde bir azaltarak 0'ı elde etmeyi amaçladım.
            return base * mathematic(base, power - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int base = input.nextInt();
        System.out.print("Üssü olan sayıyı giriniz : ");
        int power = input.nextInt();

        int result = mathematic(base, power);
        System.out.print("Sonuç : " + result);

    }
}
