package TataProduct;

import java.util.Comparator;

public class BasedOnName implements Comparator<TataProduct>{

	@Override
	public int compare(TataProduct o1, TataProduct o2) {
		
		return o1.pruductName.compareTo(o2.pruductName);
	}
	

}
