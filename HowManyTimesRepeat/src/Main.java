import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dizinizin boyut sayısını belirleyiniz : ");//Kullanıcıdan boyut sayısını istiyorum
        int size = input.nextInt();
        int[] list = new int[size];//İlk listemi boyut sayım ile eşitliyorum
        int[] myList = new int[size];//Bu dizide her bir sayının kaç kez tekrar ettiğini kontrol etmeyi amaçlıyorum.

        System.out.println("==================");
        for (int helper = 0; helper < list.length; helper++) {
            System.out.println("Dizinizin elemanlarını belirleyiniz : ");
            int numbers = input.nextInt();//Kullanıcıdan dizimin elemanlarını alıyorum.
            list[helper] = numbers;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));//Küçükten büyüğe sıralayarak kaç kez tekrar ettiğini bulma yolumu kolaylaştırıyorum.

        int repeat = 0;
        for (int controlList : list) {
            int control = 0;
            for (int helper1 = 0; helper1 < list.length; helper1++) {
                if (controlList == myList[helper1]) {
                    control++;// her bir sayının myList dizisinde daha önce kontrol edilip edilmediğini belirledim.
                }
            }
            if (control == 0) {
                int counter = 0;
                for (int helper : list) {
                    if (controlList == helper) {
                        counter++; //myList dizimdeki sayıların list dizimde kaç kez tekrar ettiğini bulmayı amaçladım.
                    }
                }
                myList[repeat] = controlList;
                repeat++;//repeatı 0 a eşitledim ve for döngümün en sonunda artı attırarak iki listemdeki sayıların kaç kez tekrar ettiğini bulmaya çalıştım.
                System.out.println(controlList + " sayısından " + counter + " tane var ");
            }
        }

    }
}

