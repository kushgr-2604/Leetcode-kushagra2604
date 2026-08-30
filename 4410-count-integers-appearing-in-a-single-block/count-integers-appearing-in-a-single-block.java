class Solution {
    public int countSpecialIntegers(int[] nums) {
       int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int blocks= 0;
            for(int j = 0;j<nums.length;j++){
                if(nums[j] == nums[i] && (j== 0 || nums[j] != nums[j-1])){
                    blocks++;
                }
            }
            if(blocks == 1){
                count ++;
            }
        }
        return count;
    }
}