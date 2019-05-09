import java.util.ArrayList;

public class TaxCollector implements Runnable{

    private TreasureRoom treasureRoom;

    public TaxCollector(TreasureRoom treasureRoom)
    {
        this.treasureRoom = treasureRoom;
    }

    @Override
    public void run() {
        ArrayList<Valuable> valuables = new ArrayList<>();

        int value = (int)((Math.random() * 150) + 50);

        int tempValue = 0;
        while (tempValue < value)
        {

            switch ((int)(Math.random() * 4))
            {
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

        treasureRoom.add(valuables);
    }
}
