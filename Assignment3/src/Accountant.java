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


            catalog.totalMoney(countWealth());

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
