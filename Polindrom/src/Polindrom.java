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
        if (reverseNumber == number) // Polindrom sayısı ise ekrana true değilse false yazısını vermesini istedim.
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        System.out.print(isPolindrom(101)) ;
    }
}