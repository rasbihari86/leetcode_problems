class Solution {
    public void nextPermutation(int[] nums) {
      int n = nums.length;
        int pivot = -1;

        // Step 1: Find the first decreasing element from the right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot found → reverse entire array
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find element just larger than pivot from right and swap
        for (int k = n - 1; k > pivot; k--) {
            if (nums[k] > nums[pivot]) {
                swap(nums, pivot, k);
                break;
            }
        }

        // Step 4: Reverse the suffix (elements after pivot)
        reverse(nums, pivot + 1, n - 1);

        // Print result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
        
        
}