class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigitSum =0;
        int multipleDigitSum = 0;
        for(int num : nums ){
            if(num <10 ){
                singleDigitSum +=num;
            }
            else{
                multipleDigitSum +=num;
            }
        }
        return singleDigitSum != multipleDigitSum;
    }
}