class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;
        Arrays.sort(nums);
        var unique = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                flag = true;
            }
        }
        return flag;
    }
}