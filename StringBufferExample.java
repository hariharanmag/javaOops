package stringSample;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		
		//length( ) and capacity( )
		System.out.println("length = " + sb.length());//5
		System.out.println("capacity = " + sb.capacity()); //5+16 = 21
		
		
		//void ensureCapacity(int minCapacity)
		sb.ensureCapacity(50);
		System.out.println("capacity = " + sb.capacity()); //50
		
		//void setCharAt(int where, char ch)
		//sb.setCharAt(1, 'i');
		//sb.setLength(2);
		System.out.println(sb);//Hi
		
		//void getChars(int sourceStart, int sourceEnd, char target[ ], int targetStart)
		char []target = new char[10];
		sb.getChars(0, 2, target, 0);
		System.out.println(target);
		
		//append( )
		int a = 20;
		sb.append(" a = ").append(a).append("!");
		System.out.println(sb);
		
		//insert( )
		sb.insert(2, "like ");
		System.out.println(sb);
		 
		//reverse( )
		sb.reverse();
		System.out.println(sb);
		 
		//delete( ) and deleteCharAt( )
		sb.delete(4, 7);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		//replace()
		sb.replace(5, 7, "was");
		System.out.println("After replace: " + sb);

	}

}
