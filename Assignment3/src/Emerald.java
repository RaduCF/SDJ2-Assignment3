public class Emerald implements Valuable {

    public String getName()
    {
        return "Emerald";
    }

    public int getValue()
    {
        return 8;
    }
    public String toString() {
    	return this.getName() + ": " + this.getValue();
    }

}



