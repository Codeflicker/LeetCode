class Solution {
    public int balancedStringSplit(String s) {
			int count = 0;
			int result = 0;
			for(char a : s.toCharArray()) {
			switch(a) {
			case 'L':
				count++;
				break;
			case 'R':
				count--;
				break;
				
			}
				if(count == 0) {
					result++;
				}
			}
    return result;
    }
}
