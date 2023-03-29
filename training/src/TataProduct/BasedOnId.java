package TataProduct;

import java.util.Comparator;

public class BasedOnId implements Comparator<TataProduct>{

	@Override
	public int compare(TataProduct o1, TataProduct o2) {
		// TODO Auto-generated method stub
		return o1.pruductId-o2.pruductId;
	}

}
