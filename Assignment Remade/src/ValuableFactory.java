public class ValuableFactory {

    private static IronIngot ironIngot;
    private static GoldIngot goldIngot;
    private static Diamond diamond;
    private static Emerald emerald;

    public static Valuable getValuable(String name)
    {
        switch (name)
        {
            case "Diamond":
                if (diamond == null)
                    diamond = new Diamond();
                return diamond;
            case "Emerald":
                if (emerald == null)
                    emerald = new Emerald();
                return emerald;
            case "Gold Ingot":
                if (goldIngot == null)
                    goldIngot = new GoldIngot();
                return goldIngot;
            case "Iron Ingot":
                if (ironIngot == null)
                    ironIngot = new IronIngot();
                return ironIngot;
                default:
                    return null;
        }
    }
}