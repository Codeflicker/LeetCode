class Solution {
    public String reverseWords(String s) {
		String[] wordlist= s.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(String word :  wordlist) {
			char[] mchar = word.toCharArray();
			for(int i = mchar.length-1; i >=0; i-- ) {
				result.append(mchar[i]);
			}
			result.append(" ");
		}
		return result.toString().trim();	
        
    }
}
