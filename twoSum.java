package LitCode;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] twoSum(int[] nums, int target) {
		int arr[] = { 0, 0 };
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int sum = nums[i] + nums[j];
				if (sum == target) {
					arr[0] = i;
					arr[1] = j;
				}
			}
		}
		return arr;
	}

}
