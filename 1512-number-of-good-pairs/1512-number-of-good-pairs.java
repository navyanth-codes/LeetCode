class Solution {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int i=0;
        for(int j=1;j<nums.length;j++)
            if(nums[i]==nums[j])
                ans += j-i;
            else
                i=j;
        return ans;
    }
}