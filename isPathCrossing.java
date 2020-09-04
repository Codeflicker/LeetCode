class Solution {
    public boolean isPathCrossing(String path) {
      	char[] wordlist = path.toCharArray();
		int x = 0;
		int y = 0;
		
		Set<String> pairset = new HashSet<>();
        pairset.add("00"); // start coordinate
		for(char data : wordlist) {
		
		switch(data) {
			case 'N':
				y=y+1;
			
				break;
			case 'E':
				x=x+1;
				
				break;
			case 'W':
				x=x-1;
				
				break;
			case 'S':
				y=y-1;
				break;
				
			}
            String value = x+""+y; 
            	if(pairset.contains(value)) {
    				return true;
	    		}else {
				    pairset.add(value);
			}
			 	
		}
		return false;
    }
}
