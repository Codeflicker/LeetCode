class Solution {
    public int romanToInt(String s) {

        char[] wordlist = s.toCharArray();
		int len = wordlist.length;
		HashMap<Character, Integer> data = new HashMap<>();
		data.put('I',1);
		data.put('V',5);
		data.put('X',10);
		data.put('L',50);
		data.put('C',100);
		data.put('D',500);
		data.put('M',1000);
		
		int sum = data.get(wordlist[0]);
		for(int i = 1;i<len;i++) {
				if(data.get(wordlist[i]) > data.get(wordlist[i-1])) {
					sum =  sum - data.get(wordlist[i-1]);
					sum += data.get(wordlist[i]) - data.get(wordlist[i-1]);
					
				}else {
					sum += data.get( wordlist[i]);				
				}				
		}
        
        return sum;
		
    }
}
