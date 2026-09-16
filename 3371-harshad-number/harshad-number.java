class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
          int og =x;
        int sum = 0;
        while(x>0){
            sum = sum + x%10;
            x = x/10;
        }
        if(og % sum == 0){
            return sum;
        }
        else{
            return -1;
        }
    }
}