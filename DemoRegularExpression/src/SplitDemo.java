import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class SplitDemo {


		    private static final String REGEX = "\\W";
		    private static final String INPUT ="Nitish 99 This 69 Prabhu 78 Just Split";
		    
		    
		    
		    public static void main(String[] args) {
		    
		    	Pattern p = Pattern.compile(REGEX);
		        String[] items = p.matcher(INPUT);
		        for(String s : items) {
		            System.out.println(s);
		        }
		    }
		



}
