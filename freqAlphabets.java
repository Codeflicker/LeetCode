class Solution {
    public String freqAlphabets(String s) {
        
        char[] stream = s.toCharArray();
		HashMap<String,Character> dataMap = new HashMap<>();
        int i = 1;
        for(char a = 'a';a<='z';a++){
            if(i<=9){
                dataMap.put(i+"",a);
            }else {
                dataMap.put(i+"#",a);
            }
            i++;
        }
   
            String result = "";
            int len = stream.length -1;
            String key = null;
            for(int a = 0; a<=len; a++ ) {
            	if(a+2<=len) {
            		if(stream[a+2] == '#') {
            			key = ""+stream[a]+stream[a+1]+stream[a+2];
            			result += dataMap.get(key);
            			a= a+2;
            		}else {
            			key = ""+stream[a];
            			result += dataMap.get(key);
            		}
            	}else {
            		key = ""+stream[a];
        			result += dataMap.get(key);
            	}
            }
          return result;  
         }
        
    }

