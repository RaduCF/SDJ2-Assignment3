public class Accountant implements Runnable {
    private String name;

    private TreasureRoom treasureRoom;
    private Catalog catalog;

public Accountant()
{
    catalog = Catalog.getInstance();

}

    @Override
    public void run() {

        while(true){

            try {
                Thread.sleep(10000);
                catalog.totalMoney(countWealth());
                Thread.sleep(10000);
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
