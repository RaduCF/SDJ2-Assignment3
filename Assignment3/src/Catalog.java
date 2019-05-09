public class Catalog {
    
    private static Catalog instance;
    private static Object lock = new Object();

    private Catalog() {
    }

    public static Catalog getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new Catalog();
                }
            }
            instance = new Catalog();
        }
        return instance;
    }

    public void throwParty(int value) {
        System.out.println("The King threw a party with a value of " + value + "$");
    }

    public void partyCanceled(int value) {
        System.out.println("The King wanted to throw a party worth " + value + "$, but not enough money was available.");
    }

    public void totalMoney(int value) {
        System.out.println("The treasure holds  " + value + "$");
    }

    public void addedValuables(String valuables) {
        System.out.println("The tax collector added " + valuables + "$ to the treasure.");
    }
}
