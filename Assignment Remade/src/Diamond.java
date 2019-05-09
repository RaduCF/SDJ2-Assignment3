public class Diamond implements Valuable {

    public String getName()
    {
        return "Diamond";
    }

    public int getValue()
    {
        return 4;
    }

    public String toString() {
    	return this.getName() + ": " + this.getValue();
    }
}