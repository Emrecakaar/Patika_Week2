public class Main {
    public static void main(String[] args) {

        int[] list = {1, 2, 3};//Array methodu oluşturdum ve değerlerini girdim.
        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
            sum += 1.0 / list[i];// harmonik serimin bölüm kısmını sum'a eşitleyerek buldum.

        }
        double avarage = (list.length) / sum;// dizideki eleman sayımı sum'a bölerek harmonik serimi oluşturdum.
        System.out.println(avarage);
    }
}