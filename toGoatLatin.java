class Solution {
    public String toGoatLatin(String s) {
		String[] wordList = s.split(" ");
		final String a = "a";
		final String ma = "ma"; 
		String result = "";		
		String space = " ";
		int i = 1;
		
		for(String word : wordList) {
			char firstLetter = word.charAt(0);
			switch(firstLetter) {
		    case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				result += word+ma+a.repeat(i)+space;
				i++;
				break;
			default:
				result += word.substring(1)+firstLetter+ma+a.repeat(i)+space;
				i++;
				break;
			
			}
			
		}
        return result.trim();
    }
}
