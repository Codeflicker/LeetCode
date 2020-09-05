class Solution {
    public String reformat(String s) {
 	char[] wordlist = s.toCharArray();
		char[] alphanum = new char[wordlist.length];
		String result = "";
		int i=0;
		int j = 1;
		
		int alpha= 0;
		int num = 0;
		for(char data : wordlist) {
			if(Character.isAlphabetic(data)) {
				alpha++;
			}else {
				num++;
			}
		}
		boolean status = false;
		switch (alpha-num) {
		case 1:
            case 0:        
			for(char data : wordlist) {
				if(Character.isAlphabetic(data)) {
					alphanum[2*i] =data;
					i++;
				}else {
					alphanum[(2*j -1)] = data;
					j++;
				}
			}
            status = true;
			break;

		case -1:
			for(char data : wordlist) {
				if(Character.isDigit(data)) {
					alphanum[2*i] =data;
					i++;
				}else {
					alphanum[(2*j -1)] = data;
					j++;
				}
			}
            status = true;
			break;
		}
		
        if(status){
            for(char data : alphanum) {
                result+=data;
            }		
        }
		return result;
    }
}
