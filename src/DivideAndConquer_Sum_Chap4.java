public class DivideAndConquer_Sum_Chap4 {
	
	public static void main (String args[]) {
		System.out.println(sum(new int[]{-1,1}));
		System.out.println(count(new int[]{-1,2,5,6,1,1}));
		System.out.println(max(new int[]{4214124,9}));
	}
	
	// 4.1
	public static int sum(int[] arr) {
		
		if (arr.length == 0)
			return 0;
		
		int arrc[] = new int[arr.length-1];
		System.arraycopy(arr, 1, arrc, 0, arr.length-1);
		return arr[0] + sum(arrc);
	}
	
	// 4.2
	public static int count(int[] arr) {
		if (arr.length == 0)
			return 0;
		int[] arrc = new int[arr.length-1];
		System.arraycopy(arr, 1, arrc, 0, arr.length-1);
		return 1+count(arrc);
	}
	
	// 4.3
	public static int max(int[] arr) {
		if (arr.length == 0)
			return 0;
		int arrc[] = new int[arr.length-1];
		System.arraycopy(arr, 1, arrc, 0, arr.length-1);
		return Math.max(arr[0], max(arrc));
	}
	
	// 4.4
	public static int binarySearch(int[] arr, int low, int high, int target) {
		
		if (low > high)
			return -1;
		int mid = (low+high)/2;
		return arr[mid] == target ? mid : target > arr[mid] ? binarySearch(arr, mid, high, target) : binarySearch(arr, low, mid, target);
	}
}

