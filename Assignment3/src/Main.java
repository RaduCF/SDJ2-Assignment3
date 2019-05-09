
public class Main {
    public static void main(String[] args) {
        TreasureRoom treasureRoom = new TreasureRoom();

        King king = new King(treasureRoom);

        TaxCollector taxCollector = new TaxCollector(treasureRoom);

        Accountant[] accountants = new Accountant[2];

        for (int i = 0; i < 3; i++){
            accountants[i] = new Accountant(treasureRoom);
        }

        Thread[] threads = new Thread[2];

        for (int t = 0; t < 3; t++){
            threads[t] = new Thread(accountants[t]);
            threads[t].start();
        }

        Thread kingTh = new Thread(king);
        kingTh.start();

        Thread taxCollectorTh = new Thread(taxCollector);
        taxCollectorTh.start();
    }
}
