package arrayDoubleMethods;

import java.util.ArrayList;

public class ArrayMethodsDoubles {

	public ArrayList<Integer> getMaxValuesIndexes(Double[] arrayDoubles, int noOfMaxValues) {
		ArrayList<Double> proxyList = new ArrayList<Double>();

		for (int i = 0; i < arrayDoubles.length; i++) {
			proxyList.add(arrayDoubles[i]);
		}

		return null;
	}

	private int getMaxValueIndex(ArrayList<Double> arrayListDoubles) {
		double initial = arrayListDoubles.get(0);
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
