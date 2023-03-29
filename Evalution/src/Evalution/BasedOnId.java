package Evalution;

import java.util.Comparator;

public class BasedOnId implements Comparator<TataPruduct> {

		@Override
		public int compare(TataPruduct o1, TataPruduct o2) {
			return o1.productId-o2.productId;
		}

		

	}



