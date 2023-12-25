
public class Main {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};//Array methodu oluşturdum ve değerlerini girdim.
        double sum = 0.0;// avarage double çıkabilme ihtimali için sum'ı double veri tipi girdim.

        for (int i = 0; i < list.length; i++) {
            sum += list[i];//for döngüsü ile toplam değerimi buldum
        }
        double avarage = sum / list.length;// harmonik sayıma ulaşmak için bu formülü kullandım
        System.out.println(avarage);//çıktısını verdim.
    }
}