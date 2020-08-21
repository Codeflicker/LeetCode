class Solution {
    public int maxNumberOfBalloons(String text) {
		final char[] balloon = {'b','a','l','l','o','o','n'};
		List<Character> mlist = new ArrayList();
		char[] input = text.toCharArray();
		
		
		// adding balloon char in mlist
		
		for(char mchar :  input) {
			for(int i = 0 ;i<balloon.length;i++) {
				if(mchar == balloon[i]) {
					mlist.add(mchar);
					break;
				}
			}
		}
				
		Collections.sort(mlist);
		int n = mlist.size()/balloon.length;
		int count = 0;
		String ball = "balloon";
		String temp = "";
		String result = "";
		for(int j = 0;j<n ; j++ ) {
		for(int i = 0;i< balloon.length;i++) {
			if(mlist.contains(balloon[i])) {
				result+=balloon[i];
				temp+=balloon[i];
				mlist.remove((Character)balloon[i]);
				}
			
			if(temp.equals(ball)) {
				count++;
				temp="";
			    }
		    }
		}
        return count;
    }
}
