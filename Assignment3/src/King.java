public class King implements Runnable {

    private TreasureRoom treasure;

    public King(TreasureRoom treasure) {
        this.treasure = treasure;
    }

    @Override
    public void run() {
        treasure.getValue(randomValue(100,200));
        
    }

    public int randomValue(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min)) + min;
    }
}
