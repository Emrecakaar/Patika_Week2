//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fighter boxer = new Fighter("Muhammed Ali", 30, 100, 95,50);
        Fighter boxer1 = new Fighter("Mike Tyson", 30, 100, 91,50);

        Match match = new Match(boxer, boxer1, 80, 100);
        match.start();


    }
}