class Solution {
    public int minOperations(int[] nums, int k) {
        int s=0;
        for(int num:nums){
            s = s+num;
        }
        return s%k;
    }
}