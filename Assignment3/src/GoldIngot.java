public class GoldIngot implements Valuable {
    @Override
    public String getName() {
        return "Gold Ingot";
    }

    @Override
    public int getValue() {
        return 32;
    }
}
