import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class TaxCollector implements Runnable {

    private TreasureRoom treasureRoom;
    private Catalog catalog;

    public TaxCollector(TreasureRoom treasureRoom) {
        this.treasureRoom = treasureRoom;
        this.catalog = Catalog.getInstance();
    }

    @Override
    public void run() {
        while (true)
        {
            ArrayList<Valuable> valuables = new ArrayList<>();

            int value = (int) (Math.floor(Math.random() * 150) + 50);

            int tempValue = 0;
            while (tempValue < value) {

                switch ((int) (Math.floor(Math.random() * 4))) {
                    case 0:
                        valuables.add(ValuableFactory.getValuable("Diamond"));
                        tempValue += ValuableFactory.getValuable("Diamond").getValue();
                        break;
                    case 1:
                        valuables.add(ValuableFactory.getValuable("Emerald"));
                        tempValue += ValuableFactory.getValuable("Emerald").getValue();
                        break;
                    case 2:
                        valuables.add(ValuableFactory.getValuable("Gold Ingot"));
                        tempValue += ValuableFactory.getValuable("Gold Ingot").getValue();
                        break;
                    case 3:
                        valuables.add(ValuableFactory.getValuable("Iron Ingot"));
                        tempValue += ValuableFactory.getValuable("Iron Ingot").getValue();
                        break;
                }
            }

            try {
                sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            treasureRoom.add(valuables);

            catalog.addedValuables("" + tempValue);
        }
    }
}
