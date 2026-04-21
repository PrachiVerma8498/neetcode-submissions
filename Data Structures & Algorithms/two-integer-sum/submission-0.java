class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i=0;i<nums.length;i++){
            int current = nums[i];
            int diff = target-current;
            for(int j =i+1;j< nums.length;j++){
                if(diff == nums[j]){
                    indices[0] = i;
                    indices[1]= j;
                    break;
                }
            }
        }
        return indices;
    }
}
