package servicesGenerics;

import java.util.List;

public class CalculationServiceEX02 {

	public static <T extends Comparable<? super T>> T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("List can't be empty ");
		}
		T max = list.get(0);
		for (T item : list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
