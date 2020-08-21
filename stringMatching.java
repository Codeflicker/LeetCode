class Solution {
    public List<String> stringMatching(String[] words) {
		HashSet<String> set = new HashSet();
		int count = 0;
		int len = words.length;
		for(int i =0; i<len; i++) {
			for(int j=0;j<len;j++ ) {
				if(i== j) {
					continue;
				}else {
					if(words[i].contains(words[j])) {
						set.add(words[j]);
					}
				}
			}
		}
		return new ArrayList<String>(set);
    }
}
