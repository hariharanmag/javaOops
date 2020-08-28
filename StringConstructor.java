package stringSample;

import java.nio.charset.Charset;

public class StringConstructor {
	

	public static void main(String[] args) {
		String str =  new String(); 
		// creates an instance of string
		
		//String(byte[] bytes)
		byte[] b_arr = {104, 101, 108, 108, 111};
		String s_byte =new String(b_arr); //hello will be stored in s_byte
		
		//String(byte[] bytes, Charset charset)
		Charset cs = Charset.defaultCharset();//utf-8
		String s_byte_char = new String(b_arr, cs);
		
		//String(char[] char_arr)
		char char_arr[] = {'h', 'e', 'e', 'l', 'o'};
		String s = new String(char_arr);//hello
	 

	}

}

