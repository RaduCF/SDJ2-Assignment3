public class Accountant implements Runnable {
    private String name;

    private TreasureRoom treasureRoom;
    private Catalog catalog;

public Accountant(TreasureRoom treasureRoom)
{
    catalog = Catalog.getInstance();
    this.treasureRoom = treasureRoom;
}

    @Override
    public void run() {

        while(true){

            try {
                Thread.sleep(5000);
                catalog.totalMoney(countWealth());
                Thread.sleep(15000);
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