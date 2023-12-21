import java.util.Scanner;

public class Calculator {

    static int summation(int a, int b) {
        int result = a + b;
        System.out.print("Result : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.print("Result : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.print("Result : " + result);
        return result;
    }

    static int divided(int a, int b) {
        int result = a / b;
        System.out.print("Result : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) ;
        result *= a;
        System.out.print("Result : " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.print("Result : " + result);
        return result;
    }

    static void calc(int a, int b) {
        System.out.print("Perimeter of rectangle : " + (2 * (a + b)));
        System.out.print("Area of rectangle : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1-Toplama işlemi\n" +
                "2-Çıkarma işlemi\n" +
                "3-Çarpma işlemi\n" +
                "4-Bölme işlemi\n" +
                "5-Üslü sayı hesaplama\n" +
                "6-Mod alma\n" +
                "7-Dikdörtgen alan ve Çevre hesabı\n" +
                "0-Çıkış yap";

        System.out.print(menu);
        while (true) {
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
            select = input.nextInt();


            if (select == 0) {
                break;
            }

            System.out.print("İlk sayınızı giriniz : ");
            int a = input.nextInt();

            System.out.print("İkinci sayınızı giriniz : ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    summation(a, b);
                    break;

                case 2:
                    minus(a, b);
                    break;

                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    if (b == 0) {
                        System.out.print("Bir sayı 0'a bölünemez.");
                    }
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.print("Geçersiz bir işlem girdiniz : ");
            }
        }
        System.out.print("Bizi tercih ettiğiniz için teşekkürler!!");
    }
}
