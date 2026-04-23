class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int max_count = 1;
        List<Integer> numSet = Arrays.stream(nums).boxed().distinct().toList();
        int i = 0;
        int j = 1;
        int diff = 1;
        int arrDiff = 0;
        System.out.println(numSet);
        while (j < numSet.size()) {
            arrDiff = numSet.get(j) - numSet.get(i);
            if (arrDiff == diff) {
                j++;
                count++;
                diff++;
            } else {
                i = j;
                j++;
                diff = 1;
                max_count = Math.max(max_count, count);
                count = 1;
            }
        }
        max_count = Math.max(max_count, count);
        return max_count;
    }
}
