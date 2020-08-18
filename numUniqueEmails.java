import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet();
		for(String email : emails) {
			String[] fullEmail = email.split("@");
			String name = fullEmail[0].replace(".", ""); 
			String domain = fullEmail[1];
			String localName = name.split("\\+")[0];
			emailSet.add(localName+"@"+domain);	
		}
        return emailSet.size();
    }
}
