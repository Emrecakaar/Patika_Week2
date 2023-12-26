import java.util.Arrays;//Dizimde bulunan sayıları kullanmak için Arrays sınıfından yardım alıyorum.
import java.util.Scanner;//Dizimi kullanıcı oluşturabilmesi için Scanner sınıfımdan yardım alıyorum.

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizide kaç sayı olacağını belirtiniz : ");
        int size = input.nextInt();
        int[] list = new int[size];//Kullanıcıdan aldığım ilk numaramı dizimin boyutu olarak belirliyorum.


        for (int i = 0; i < list.length; i++) {
            System.out.println("Dizi içerisindeki numaraları giriniz : ");
            int numbers = input.nextInt();
            list[i] = numbers;//Daha sonra dizi içerisindeki numaraları kullanıcıdan girmesini istiyoru.
        }

        System.out.print("Girdiğiniz sayılar : ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");//Kullanıcıdan aldığım değerlerin çıktısını veriyorum
        }

        System.out.println();
        Arrays.sort(list);//Kullanıcıdan aldığım dizi değerimi küçükten büyüğe doğru sıralıyorum.
        System.out.print("Girdiğiniz sayıların küçükten büyüğe doğru sıralanmış hali : ");
        System.out.print(Arrays.toString(list));//Ve son halini çıktı olarak kullanıcıya sunuyorum.


    }
}