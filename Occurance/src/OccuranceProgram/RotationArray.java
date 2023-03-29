package OccuranceProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotationArray {

	public static void main(String[] args) {
		int input = 2;
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
//		for (int i = 1; i < 4; i++) {
//			int tt = list.get(4);
//
//			for (int j = 4; j > 0; j--) {
//				list.set(j, list.get(j - 1));
//			}
//			list.set(0, tt);
//		}
//		System.out.println(list);

		Collections.rotate(list, 4);
		System.out.println(list);
	}
}
