class Solution {
    public int arrangeCoins(int n) {
        long x = 2L * n;
        return (int)(Math.sqrt(x+0.25)-0.5);
    }
}