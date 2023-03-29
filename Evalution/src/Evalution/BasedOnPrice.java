package Evalution;

import java.util.Comparator;

public class BasedOnPrice implements Comparator<TataPruduct> {

	@Override
	public int compare(TataPruduct o1, TataPruduct o2) {
		return o1.productPrice-o2.productPrice;
	}

	

}
