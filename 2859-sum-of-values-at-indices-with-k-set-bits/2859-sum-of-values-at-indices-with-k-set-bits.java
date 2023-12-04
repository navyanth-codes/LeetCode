class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int index=0;
        int sum=0;
            for( int n : nums){
                int bits=countSetBits(index++);
                if(bits==k){
                    sum+=n;
                }
            }
            return sum;
    }
    public int countSetBits(int n){
        int count=0;
        while(n>0){
            if(n%2!=0){
                count++;
            }
            n=n/2;
        }
        return count;
    }
}