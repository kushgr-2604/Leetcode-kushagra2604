class Solution {
    public void swap(int[] heights, int i, int j  ){
        int temp = heights[i];
        heights[i] = heights[j];
        heights[j] = temp; 
    }
    public int heightChecker(int[] heights) {
        int count = 0;
        int [] expected = heights.clone();

        for(int i=0; i<expected.length - 1; i++ ){
            int min =i;
            for(int j = i+1; j<expected.length;j++ ){
                if(expected[j] < expected[min]){
                    min = j;
                }
            }
            swap(expected,i, min);
        } 

        for(int i= 0;i< heights.length;i++ ){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
}