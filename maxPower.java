class Solution {
    public int maxPower(String s) {
        char[] wordlist = s.toCharArray();
		List<Character> charList = new ArrayList<Character>();
		for(char mchar : wordlist) {
			charList.add(mchar);
		}
		
		System.out.println(Arrays.asList(charList));
		int power = 0;
		char startChar = wordlist[0];
		int tempPower = 0;
		for(char mchar : charList) {
			if(startChar == mchar) {
				tempPower+=1;
			}else {
				if(tempPower > power) {
					power = tempPower;
					tempPower = 1;
				}else {
                    tempPower = 1;
                }
				startChar = mchar;
			}
		}
        	int result = power>tempPower?power:tempPower;
        return result;
    }
}
