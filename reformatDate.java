import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class Solution {
    public String reformatDate(String input) {
        DateFormat inputFormat = new SimpleDateFormat("dd MMM yyyy",Locale.getDefault());
		DateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
     	String[] remove = {"th","nd","rd","st"};
		for(String noise : remove) {
			input = input.replace(noise, "");
		}
        String result = "";    
		try {
			Date date = inputFormat.parse(input);
            result = targetFormat.format(date);
        } catch (ParseException e) {
			e.printStackTrace();
		}
        return result;
    }
}
