import java.util.ArrayList;

public class TaxCollector {

    TreasureRoom treasureRoom;

    public TaxCollector(TreasureRoom treasureRoom)
    {
        this.treasureRoom = treasureRoom;
    }

    public void collectTax()
    {
        ArrayList<Valuable> valuables = new ArrayList<>();

        int value = (int)((Math.random() * 150) + 50);

        int tempValue = 0;
        while (tempValue < value)
        {

            switch ((int)(Math.random() * 4))
            {
                case 0:
                    valuables.add(ValuableFactory.getValuable("Diamond"));
                    break;
                case 1:
                    valuables.add(ValuableFactory.getValuable("Emerald"));
                    break;
                case 2:
                    valuables.add(ValuableFactory.getValuable("Gold Ingot"));
                    break;
                case 3:
                    valuables.add(ValuableFactory.getValuable("Iron Ingot"));
                    break;
            }

        }

        treasureRoom.add(valuables);
    }

}
