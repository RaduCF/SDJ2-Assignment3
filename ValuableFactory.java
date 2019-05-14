import java.util.WeakHashMap;

public class ValuableFactory {

    private static WeakHashMap<String, Valuable> hashmap = new WeakHashMap<>();

    public static Valuable getValuable(String name)
    {
        if (!hashmap.containsKey((name)))
        {
            //The valuable has not yet been created. lets create it
            switch (name)
            {
                case "Diamond":
                    hashmap.put(name, new Diamond());
                    break;
                case "Emerald":
                    hashmap.put(name, new Emerald());
                    break;
                case "Gold Ingot":
                    hashmap.put(name, new GoldIngot());
                    break;
                case "Iron Ingot":
                    hashmap.put(name, new IronIngot());
                    break;
                default:
                    return null;
            }
        }

        return hashmap.get(name);
    }
}