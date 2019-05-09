public class Accountant implements Runnable {
    private String name;

    private TreasureRoom treasureRoom;
    private Catalog catalog;
    private int seconds;

public Accountant(TreasureRoom treasureRoom, int seconds)
{
    this.catalog = Catalog.getInstance();
    this.treasureRoom= treasureRoom;
    this.seconds = seconds;
}

    @Override
    public void run() {
        while(true){

            try {
                Thread.sleep(seconds);
                catalog.totalMoney(countWealth());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    private int countWealth()
    {
        int wealth = 0;
        for (Valuable valuable : treasureRoom.getValuables())
        {
           wealth+=valuable.getValue();
        }

        return wealth;
    }

}
