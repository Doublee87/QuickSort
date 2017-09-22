public class QuickSort {

	public void quickSort(Station[] list, int left, int right) {
		// we make sure the limits are valid....
		if (left < right) {


			int pivotIndex = median(list, left, (left + right) / 2, right);
			
			int pivotNewIndex = partition(list, left, right, pivotIndex);
			// call recursively for the 2 sub-intervals
			quickSort(list, left, pivotNewIndex - 1);
			quickSort(list, pivotNewIndex + 1, right);
		}
	}

	// this will return the minimum in the given interval
	public int min(Station[] t, int left, int right) {
		double minimum = t[left].getDistance();
		int minI = left;
		// check each element
		for (int i = left + 1; i <= right; i++) {
			// if it is the new minimum store it's value and index
			if (t[i].getDistance() < minimum) {
				minimum = t[i].getDistance();
				minI = i;
			}
		}
		return minI;
	}

	// will find the median in the interval
	public int median(Station[] t, int left, int middle, int right) {

		if (t[left].getDistance() <= t[middle].getDistance() && t[middle].getDistance() <= t[middle].getDistance())
			return middle;
		else if (t[middle].getDistance() <= t[left].getDistance() && t[left].getDistance() <= t[right].getDistance())
			return left;
		else
			return right;
	}

	// does the partition
	public int partition(Station[] list, int left, int right, int pivIndex) {

		Station pivotValue = list[pivIndex];
		list[pivIndex] = list[right];
		list[right] = pivotValue;
		int storeIndex = left;

		// foe each in the interval
		for (int i = left; i < right; i++) {
			if (list[i].getDistance() <= pivotValue.getDistance()) {
				// swap values
				Station stList = list[i];
				list[i] = list[storeIndex];
				list[storeIndex] = stList;
				storeIndex++;
			}
		}

		// swap values
		Station stList = list[storeIndex];
		list[storeIndex] = list[right];
		list[right] = stList;

		return storeIndex;
	}
}