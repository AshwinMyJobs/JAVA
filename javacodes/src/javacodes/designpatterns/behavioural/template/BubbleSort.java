package javacodes.designpatterns.behavioural.template;

public class BubbleSort extends Algorithm {

	public BubbleSort(int[] nums) {
		super(nums);
	}

	@Override
	protected void initialize() {
		System.out.println("Initializing bubble sort algorithm...........");
	}

	@Override
	protected void sorting() {
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i; j<nums.length; j++) {
				if(nums[i]>nums[j])
					swap(i, j);
			}

		}
	}

	@Override
	protected void showResult() {
		for(int i=0; i<nums.length; i++)
			System.out.print(nums[i] + " ");
	}

}
