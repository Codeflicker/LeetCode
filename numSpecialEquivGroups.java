import java.util.*;

class Solution {
    public int numSpecialEquivGroups(String[] A) {
		HashSet<String> pairSet = new HashSet();
		for(String word : A) {
			List<Character> oddList = new ArrayList();
			List<Character> evenList = new ArrayList();
			
			for(int i = 0;i<word.length();i++) {
				if(i%2==0) {
					evenList.add(word.charAt(i));
				}else {
					oddList.add(word.charAt(i));
				}			
			}
			Collections.sort(evenList);
			Collections.sort(oddList);
			pairSet.add(evenList.toString()+oddList);
		}
        return pairSet.size();
    }
}
