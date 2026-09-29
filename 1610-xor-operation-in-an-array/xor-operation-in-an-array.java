class Solution {
    public int xorOperation(int n, int start) {
        int i=0;
        int a =0;
        for(int j =0;j<n;j++){
            a = a^(start+(2*i));
            i++;
        }
        return a;
    }
}