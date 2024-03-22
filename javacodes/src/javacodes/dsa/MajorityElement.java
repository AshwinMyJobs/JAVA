package javacodes.dsa;

public class MajorityElement {

	public static void main(String[] args) {

	}

	public int findMajorEle(int arr[]) {
		int size = arr.length;

		// points to the element
		// that can be the majority element
		int majIndex = 0;
		int cnt = 1;
		int j;
		for (j = 1; j < size; j++) {
			if (arr[majIndex] == arr[j]) {
				// if the current element is same
				// increament the count by 1
				cnt = cnt + 1;
			} else {
				// if the current element is not same
				// decrease the count by 1
				cnt = cnt - 1;
			}
			if (cnt == 0) {
				// if the count is zero then the
				// element pointed by majIndex
				// can never the answer. Hence, we
				// update the count as well the majIndex
				majIndex = j;
				cnt = 1;
			}
		}

		if (isMajor(arr, arr[majIndex])) {
			return arr[majIndex];
		}

		return -1;

	}

	// a method that checks whether ele is the major element
	// present in the array arr or not
	public boolean isMajor(int arr[], int ele) {
		int s = arr.length;

		int cnt = 0;

		for (int i = 0; i < s; i++) {
			if (ele == arr[i]) {
				cnt = cnt + 1;
			}
		}

		// as per the definition,
		// cnt has to more that half of the size of
		// the input array
		if (cnt > (s / 2)) {
			return true;
		}

		return false;
	}
}
