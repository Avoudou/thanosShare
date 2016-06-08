package arrayDoubleMethods;

import java.util.ArrayList;

public class ArrayMethodsDoubles {

	public ArrayList<Integer> getMaxValuesIndexes(Double[] arrayDoubles, int noOfMaxValues) {
		ArrayList<Double> proxyList = new ArrayList<Double>();
		ArrayList<Double> unsortedMaxValues = new ArrayList<Double>();
		for (int i = 0; i < arrayDoubles.length; i++) {
			proxyList.add(arrayDoubles[i]);
		}

		ArrayList<Integer> maxValueIndexes = new ArrayList<Integer>();

		for (int j = 0; j < noOfMaxValues; j++) {
			int currentMaxValueIndex = getMaxValueIndex(proxyList);
			maxValueIndexes.add(currentMaxValueIndex);
			unsortedMaxValues.add(proxyList.get(currentMaxValueIndex));
			proxyList.remove(currentMaxValueIndex);
		}
		for (int k = 0; k < unsortedMaxValues.size() - 1; k++) {
			if (unsortedMaxValues.get(k) < unsortedMaxValues.get(k + 1)) {
				double temp = unsortedMaxValues.get(k);
				unsortedMaxValues.set(k, unsortedMaxValues.get(k + 1));
				unsortedMaxValues.set(k + 1, temp);
				int tempIndex = maxValueIndexes.get(k);
				maxValueIndexes.set(k, maxValueIndexes.get(k + 1));
				maxValueIndexes.set(k + 1, tempIndex);
			}
		}

		return maxValueIndexes;
	}

	private int getMaxValueIndex(ArrayList<Double> arrayListDoubles) {

		int maxValueIndex = 0;
		if (arrayListDoubles.size() == 1) {
			return maxValueIndex;
		}
		for (int i = 1; i < arrayListDoubles.size(); i++) {
			if (arrayListDoubles.get(maxValueIndex) - arrayListDoubles.get(i) > 0) {
				maxValueIndex = i;

			}

		}

		return maxValueIndex;
	}

}
