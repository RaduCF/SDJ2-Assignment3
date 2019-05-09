public class IronIngot implements Valuable {
    @Override
    public String getName() {
        return "Iron Ingot";
    }

    @Override
    public int getValue() {
        return 1;
    }
    public String toString() {
    	return this.getName() + ": " + this.getValue();
    }
}
