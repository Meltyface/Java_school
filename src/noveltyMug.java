
public class noveltyMug implements MugInterface {
	float capacity = 250;
	float liquid = 0;
	float fullness = 0;
	
	public void liquid (float newValue) {
		liquid = newValue;
	}
	
	public void fullness (float newValue) {
		fullness = liquid/capacity;
	}
}
