class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int size = nums.length-k+1;
        int[] result = new int[size];
        for(int i=0;i< size;i++){
            int max = nums[i];
            int j = i;
            for(int count=0;count<k;count++){
                max = Math.max(max, nums[j]);
                j++;
            }
            result[i] = max;

        }
        return result;
        
    }
}
