package stringSample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	public static void main(String[] args) {
		 //Pattern p = Pattern.compile("a*b");
		 //Matcher m = p.matcher("aaaaab");
		 //boolean b = m.matches();
		
		//boolean b = Pattern.matches("a*b", "aaaaab");

		 //System.out.println(b);
		
		
		// Create a pattern to be searched 
        Pattern pattern = Pattern.compile("hello"); 
        Matcher m = pattern.matcher("hello hai Hello "); 
        System.out.println(m.find());
        System.out.println("Pattern found from " + m.start() + 
                               " to " + (m.end()-1)); 
        
        
        //using regex
        pattern = Pattern.compile("h*");
        m = pattern.matcher("hello hai Hello "); 
        //System.out.println(m.find()); wll print only 0 to 0 coz "h" also matches the pattern
//        while(m.find())
//        	System.out.println("Pattern found from " + m.start() + 
//                               " to " + (m.end()-1)); 
        
        
        //we can use split in a similar fashion
	}

}
