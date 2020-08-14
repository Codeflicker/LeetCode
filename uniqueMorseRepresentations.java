class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       
        String[] pattern = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap <Character,String> values = new HashMap<Character,String>();
        int i = 0;
        for(char a = 'a'; a<='z';a++){
            values.put(a,pattern[i]);
            i++;
        }
        
        Set<String> set = new HashSet<String>(); 
        for(String data : words) {
        	char str[] = data.toCharArray();
        	String mresult = "";
        	for(char mchar : str) {
        		mresult += values.get(mchar);
        	}
        	set.add(mresult);
        }
    return set.size();
    }
}
