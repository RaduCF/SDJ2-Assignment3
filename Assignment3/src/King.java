import static java.lang.Thread.sleep;

public class King implements Runnable {

    private TreasureRoom treasure;
    private Catalog catalog;

    public King(TreasureRoom treasure) {
        this.treasure = treasure;
        this.catalog = catalog.getInstance();
    }

    @Override
    public void run() {
        while (true) {

            int value = randomValue(100, 200);

            if (treasure.getBalance() >= value) {
                treasure.GetValue(value);
                catalog.throwParty(value);
            }
            else{
                catalog.partyCanceled(value);
            }
            try {
                sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int randomValue(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min)) + min;
    }
}
