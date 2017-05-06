import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort_Practice {

	public static void main(String... args) {
		System.out.println(Arrays.toString(quicksort(new int[] {-1,-5,0,4214})));
		
	}

	public static int[] quicksort(int[] arr) {
		int[] result;

		if (arr.length < 2)
			return arr;
		else {
			int mid = arr.length / 2;
			int pivot = arr[mid];
			ArrayList<Integer> left = new ArrayList<Integer>();
			ArrayList<Integer> right = new ArrayList<Integer>();

			// Populate left and right arrays
			for (int i = 0, c = 0, d = 0; i < arr.length; i++) {
				if (arr[i] < pivot) {
					left.add(arr[i]);
				}
				else if (arr[i] > pivot) {
					right.add(arr[i]);
				}
			}
			
			int[] leftarr = new int[left.size()];
			int[] rightarr = new int[right.size()];
			int c = 0;
			for (int i : left) {
				leftarr[c++] = i;
			}
			c = 0;
			for (int i : right) {
				rightarr[c++] = i;
			}

			result = combineArrays(quicksort(leftarr), new int[] { pivot }, quicksort(rightarr));
		}

		return result;
	}

	public static int[] combineArrays(int[] a, int b[], int[] c) {

		int[] result = new int[a.length + b.length + c.length];
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, a.length, b.length);
		System.arraycopy(c, 0, result, a.length + b.length, c.length);

		return result;
	}

}
