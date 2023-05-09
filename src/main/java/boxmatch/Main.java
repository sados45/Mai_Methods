package boxmatch;

public class Main {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Piro", 10, 95, 90, 20);
        Fighter f2 = new Fighter("Joe", 10, 95, 90, 20);

        Match match = new Match(f1,f2,90,110);
        match.run();

    }
}
