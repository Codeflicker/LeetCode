class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int result = -1;
        int i = 0;
        String[] wordList = sentence.split(" ");
        for(String word : wordList){
            i++;
            if(word.length() >= searchWord.length()){
                String match = word.substring(0,searchWord.length());
                if(match.equals(searchWord)){
                    result = i;
                    return result;
                }
            }
        }
        return result;
        
    }
}
