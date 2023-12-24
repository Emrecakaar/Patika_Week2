import java.util.Random;

class Match {
    Fighter boxer;
    Fighter boxer1;
    int minWeight;
    int maxWeight;


    Match(Fighter boxer, Fighter boxer1, int minWeight, int maxWeight) {
        this.boxer = boxer;
        this.boxer1 = boxer1;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }


    void start() {
        if (isWeight()) {
            isStartChance();
            while (boxer.health > 0 && boxer1.health > 0) {
                boxer1.health = boxer.hit(boxer1);
                if (isWin()) {
                    break;
                }
                boxer.health = boxer1.hit(boxer);
                if (isWin()) {
                    break;
                }
                printScore();
            }
        } else {
            System.out.println("Sporcuların sikletleri uyuşmuyor!!");
        }
    }

    boolean isWeight() {
        return (boxer.weight >= minWeight && boxer.weight <= maxWeight) && (boxer1.weight >= minWeight && boxer1.weight <= maxWeight);
    }


    boolean isWin() {
        if (boxer.health == 0) {
            System.out.println("Maçın galibi : " + boxer.name);
            return true;
        } else if (boxer1.health == 0) {
            System.out.println("Maçın galibi : " + boxer1.name);
            return true;

        }
        return false;

    }

    boolean isStartChance() {
        Random random = new Random();
        int rastgeleSayi = random.nextInt(100) + 1;
        if (rastgeleSayi > 0 && rastgeleSayi < 50) {
            System.out.println("Maça " + boxer.name + " başlıyor.");
        } else if (rastgeleSayi > 50 && rastgeleSayi < 100) {
            System.out.println("Maça " + boxer1.name + " başlıyor.");
        }
        return true;
    }

    public void printScore() {
        System.out.println(boxer.name + " Kalan Can \t:" + boxer.health);
        System.out.println(boxer1.name + " Kalan Can \t:" + boxer1.health);
        System.out.println("------------");
    }

}
