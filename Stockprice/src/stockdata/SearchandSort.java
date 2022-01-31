package stockdata;

public class SearchandSort {
	public int SearchandSort(Share[] array, double key) {
		int last = array.length - 1;
		int first = 0;
		int mid = (0 + last)/2;
		while (first <= last) {
			if (array[mid].price == key) {
				return mid;
			} else if(array[mid].price < key) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (first + last)/2;
		}
		return -1;
		
	}
	
}
