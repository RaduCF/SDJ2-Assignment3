import java.util.*;

public class TreasureRoom {
<<<<<<< HEAD
<<<<<<< HEAD
    static Queue<Valuable> queue;
    static ArrayList<Valuable> valuables;


    public TreasureRoom() {
        valuables = new ArrayList<>();
        queue = new LinkedList<>();
    }

    public void enqueue(Valuable valuable) {
        queue.add(valuable);
    }

    public ArrayList<Valuable> getValuables() {
        return valuables;
    }

    /**
     * returns closest lower integer value and subtracts from this
     *
     * @param value - is how much you want to take out
     * @return the closest value of the initial value
     */
    public int GetValue(int value) {
        int[] values = {8, 4, 2, 1};

        for (int i = 0; i < values.length; i++) {
            values[i] = (value - (value % values[i])) / values[i];
            value -= values[i] * values[i];
        }

        int valueIndex = 0;
        int out = 0;
        for (int i = 0; i < valuables.size(); i++) {

            int currentVal = valuables.get(i).getValue();

            switch (currentVal) {
                case 8:
                    valueIndex = 0;
                    break;
                case 4:
                    valueIndex = 1;
                    break;
                case 2:
                    valueIndex = 2;
                    break;
                case 1:
                    valueIndex = 3;
                    break;
            }

            if (values[valueIndex] < 1) {
                continue;
            }

            out += values[valueIndex];
            values[valueIndex]--;
            valuables.remove(i);
        }
        return out;
    }

    public void removeByIndex(int i) {
        valuables.remove(i);
    }

    static class Write implements Runnable {

        @Override
        public void run() {
            while (true) {
                if (queue.size() == 0) {
                    try {
                        wait(5000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
                valuables.add(queue.poll());
            }
        }

    }

=======
=======
>>>>>>> parent of ecb7b62... Merge branch 'master' into Accountant
	static Queue<Valuable> queue;
	static ArrayList<Valuable> valuables;
	
	
	public TreasureRoom() {
		 valuables = new ArrayList<>();
		 queue = new LinkedList<>();
	}
	
	public void enqueue(Valuable valuable) {
		queue.add(valuable);
	}
	
	public ArrayList<Valuable> getValuables() {
		return valuables;
	}
	
	/**
	 * returns closest lower integer value and subtracts from this
	 * @param value - is how much you want to take out
	 * @return
	 */
	public int GetValue(int value) {
		int[] values = {8,4,2,1};
		
		for (int i = 0; i < values.length; i++) {
			values[i] = (value - (value % values[i]))/values[i];
			value -= values[i] * values[i];
		}
		
		int valueIndex = 0;
		int out = 0;
		for (int i = 0; i < valuables.size(); i++) {
			
			int currentVal = valuables.get(i).getValue();
			
			switch (currentVal) {
			case 8:
				valueIndex = 0;
				break;
			case 4:	
				valueIndex = 1;
				break;
			case 2:
				valueIndex = 2;
				break;
			case 1:	
				valueIndex = 3;
				break;
			}
			
			if (values[valueIndex] < 1) {
				continue;
			}
			
			out += values[valueIndex];
			values[valueIndex]--;
			valuables.remove(i);
		}
		return out;
	}
	
	public void removeByIndex(int i) {
		valuables.remove(i);
	}

	static class Write implements Runnable {

		@Override
		public void run() {
			while(true){
				if (queue.size() == 0) {
					try {
						wait(5000);
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				}
				valuables.add(queue.poll());	
			}
		}
		
	}
	
>>>>>>> parent of ecb7b62... Merge branch 'master' into Accountant
}
