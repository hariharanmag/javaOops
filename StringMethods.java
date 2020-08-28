package stringSample;

import java.util.Locale;

public class StringMethods {
	public static void main(String[] args) {
		String str = "This class shows few java methods";
		
		//int length()
		System.out.println(str.length());//33
		
		//Char charAt(int i)
		System.out.println(str.charAt(5));//c
		
		//String substring (int i)
		System.out.println(str.substring(5)); //class shows few java methods
		
		//String concat( String str)
		System.out.println(str.concat(str));//This class shows few java methodsThis class shows few java methods
		
		//int indexOf (String s)
		System.out.println(str.indexOf("class"));//5
		
		//Int lastindexOf( int ch)
		System.out.println(str.lastIndexOf("a"));//24
		
		//boolean equals( Object otherObj)
		System.out.println(str.equals(str)); //true
		
		//boolean  equalsIgnoreCase (String anotherString)
		System.out.println(str.equalsIgnoreCase("this class")); //false
		
		//String toLowerCase()
		System.out.println(str.toLowerCase()); //this class shows few java methods
		
		//String toUpperCase()
		
		//String trim()
		String word1 = " Learn Share Learn    ";
		String word2 = word1.trim(); // “Learn Share Learn”
		
		//static String join(CharSequence delim, CharSequence . . . strs)
		String result = String.join(" ", "Alpha", "Beta", "Gamma");
		System.out.println(result);
		/* -------------FORMAT-----------------*/
		//public static String format(Locale loc, String form, Object… args)
		double piVal = Math.PI;
		System.out.format(Locale.US, "%10.2f\n", piVal);
		
		//public static String format(String form, Object… args)
		System.out.format("%f\n", piVal);
		
		int num = 345;
		String format1 = String.format("%07d", num);
		System.out.println(format1);
		
		String format2 = String.format("The numbers are" +  
                ": %1$s, %1$s and %2$s", num, piVal); 
 
       System.out.println(format2);
		
		
		

		
	}
	
	

}
