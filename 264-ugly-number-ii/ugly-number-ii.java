class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] =1;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        for(int i=1;i<n;i++){
            int num2 = ugly[i2] *2;
            int num3 = ugly[i3] * 3;
            int num5 = ugly[i5] *5;
            int next =Math.min(num2,Math.min(num3,num5));

            ugly[i] =next;
            if(next == ugly[i2]*2){
                i2++;
            }
            if(next == ugly[i3]*3){
                i3++;
            }
            if(next == ugly[i5]*5){
                i5++;
            }
        } 
        return ugly[n-1];
    }
}