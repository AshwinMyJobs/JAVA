package javacodes.designpatterns.behavioural.template;

public class TestMain {

	public static void main(String[] args) {
		
		int[] nums = {5,4,3,2,1};
		
		Algorithm sort = new BubbleSort(nums);
		
		sort.sort();
	}

}
