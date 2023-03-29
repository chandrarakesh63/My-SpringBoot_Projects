package TataProduct;

import java.util.Comparator;

public class BasedOnPrice implements Comparator<TataProduct>{

	@Override
	public int compare(TataProduct o1, TataProduct o2) {
		
		return o1.pruductPrice - o2.pruductPrice;
	}
	

}
