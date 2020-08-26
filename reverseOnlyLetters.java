class Solution {
    public String reverseOnlyLetters(String s) {
        char[] wordlist = s.toCharArray();
		int len = wordlist.length;
		char[] newList = new char[len];
		String seq = "";
		String revSeq = "";
	
		HashMap<Integer,Character> map = new HashMap<>();
		for(int i = 0;i<len;i++) {
			if(Character.isAlphabetic(wordlist[i])) {
				seq+=wordlist[i];
				revSeq = wordlist[i]+revSeq; 
			}else {
				map.put(i,wordlist[i]);
				newList[i] = wordlist[i];
			}
		}		
		
		char[] revList = revSeq.toCharArray(); 
		
		int pos = 0;
		String result = "";
		
		for(int i =0; i<len;i++) {
			if(newList[i] == '\0') {
				newList[i] = revList[pos];
				pos++;
			}
			result+=newList[i];
		}
        
        return result;
    }
}

