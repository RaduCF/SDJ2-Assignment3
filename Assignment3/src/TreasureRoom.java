import java.util.*;

public class TreasureRoom {
	public ArrayList<Valuable> valuables;
	
	
	public TreasureRoom() {
		 valuables = new ArrayList<>();
	}
	
	
	public synchronized void add(ArrayList<Valuable> valuables) {
		this.valuables.addAll(valuables);	
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
		
		ArrayList<Valuable> remove = new ArrayList<>();
		
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
			remove.add(valuables.get(i));
			
			
		}
		for (int i = 0; i < remove.size(); i++) {
			valuables.remove(remove.get(i));
		}
		return out;
	}
	
	public void removeByIndex(int i) {
		valuables.remove(i);
	}
	
}
