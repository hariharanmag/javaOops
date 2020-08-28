package stringSample;

import java.util.Locale;

public class LocaleExample {

	public static void main(String[] args) {
		Locale locale=Locale.getDefault();  
		//Locale locale=new Locale("fr","fr");//for the specific locale  
		  
		System.out.println(locale.getDisplayCountry());  
		System.out.println(locale.getDisplayLanguage());  
		System.out.println(locale.getDisplayName());  
		System.out.println(locale.getISO3Country());  
		System.out.println(locale.getISO3Language());  
		System.out.println(locale.getLanguage());  
		System.out.println(locale.getCountry());  
		
		
		/* prints english in different languages
		 Locale enLocale = new Locale("en", "US");  
        Locale frLocale = new Locale("fr", "FR");  
        Locale esLocale = new Locale("es", "ES");  
        System.out.println("English language name (default): " +   
                            enLocale.getDisplayLanguage());  
  
        System.out.println("English language name in French: " +   
                            enLocale.getDisplayLanguage(frLocale));  
        System.out.println("English language name in spanish: " +   
                enLocale.getDisplayLanguage(esLocale));  
		 */
		


	}

}
