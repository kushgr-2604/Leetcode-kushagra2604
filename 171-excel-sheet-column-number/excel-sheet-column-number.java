class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for(int i = 0;i< columnTitle.length(); i++ ){
            int val = columnTitle.charAt(i) - 'A' + 1;

            res = res * 26 + val; 
        }
        return res;
        //  int result = 0;

        // for (char c : columnTitle.toCharArray()) {

        //     int value = c - 'A' + 1;

        //     result = result * 26 + value;
        // }

        // return result;
    }
}