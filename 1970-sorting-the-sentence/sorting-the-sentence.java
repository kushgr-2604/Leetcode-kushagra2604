class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");

        for(int i=0;i< words.length;i++){
            for(int j =0;j<words.length -i-1;j++)
            {
                int pos1 = words[j].charAt(words[j].length()-1) -'0';
                int pos2 = words[j+1].charAt(words[j+1].length()-1) -'0';

                if(pos1>pos2){
                    String temp = words[j];
                    words[j] =words[j+1];
                    words[j+1] = temp;
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        for(String word : words){
            ans.append(word.substring(0,word.length() - 1 )).append(" ");
        }
        return ans.toString().trim();


    }
}