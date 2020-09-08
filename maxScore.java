class Solution {
    public int maxScore(String s) {
        int max = 0;
		int zeroLeft = 0;
		int oneRight = 0;
		int pointer = 0;
		
		for(int i = 0;i<s.length();i++) {
			for(int j = 0;j<s.length();j++) {	
				if(j <= pointer && s.charAt(j) == '0' && pointer < s.length()-1) {
					zeroLeft+=1;
				}else if(j>pointer  && s.charAt(j) == '1' && pointer < s.length()-1) {
						oneRight+=1;
					}
				
			}
			int sum = zeroLeft+oneRight;
			if(max < sum) {
				max = sum;
			}
			pointer+=1;
			zeroLeft = 0;
			oneRight = 0;
		}
        return max;
    }
}
