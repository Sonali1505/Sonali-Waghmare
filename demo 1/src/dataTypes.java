
public class dataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//varibles declaration - Invalid Identifier Examples 
		
				//int for=13;// error bcoz keyword cannot be identifier 

				//int num 1=13;  // error bcoz do not add space 
				
				//int @num3=13;  //error bcoz identifier can not start with specila symbol except $_
				
				//valid Identifier Examples 
				
				int $num1= 20;
				
				System.out.println("Values of the number varible is :"+ $num1);
				
				String studentName="Shreya";
				
				System.out.println("value is "+ studentName);
				
				//byte takes 1 byte
				byte byteMax=127;
				byte byteMin=-128;
				
				System.out.println("Min range of byte is " + byteMin 
						+ "  Max range of byte is :"+ byteMax);
				
				//short ---- 2 byte 
				short shortMax= 32767;
				short shortMin= -32768;
				
				System.out.println("Min range of short is " + shortMin 
						+ "  Max range of short is :"+ shortMax);
				
				//int --- 4 byte
				int minInt = -2147483648;
				int maxInt = 2147483647;
				
				//long - 8byte
				long maxLong=9223372036854775807L;
				long minLong=	-9223372036854775808L;	
				
				float f=3234.141243278345f;
				double d= 3456.14124512345678902345678914f;
				System.out.println("float value is " + f+ " double value " + d);
				
				
				boolean  flag= false;
				System.out.println("boolean value is "+flag);
				
				//assigning single character literal
				
				char ch='a';
				System.out.println(ch);
				
				//assigning num to char
				
				char ch1 = 65;
				
				System.out.println(ch1);
				
				//assigning unicode to char
				
				char var1= '\u00A7';
				System.out.println(var1);
				
				//Unicode representation
				char v2='\u20AC';
				System.out.println(v2);
				
				//Asci code representation
				int a='A';
				System.out.println(a);
				
				int value1 = 9 / 2;  // integer division 
				
				System.out.println(value1);
				float value2 = 101f /61f;
				
				System.out.println(value2);
				
				double value3 = 10d/6d;
				
				float value4 = 5/2f;
				System.out.println(value4);
				
				
				int radius=10;
				//assigning expression to varible
				double percentage =3.14 * radius  * radius;
				
				System.out.println("Percentage : "+ percentage);
				
				//widening  / implicit type casting
				
				byte b= 10;
				int l= b;
				System.out.println(l);
				
				float x= 22.14f;
				double w= x;
				System.out.println(d);
				
				char c='A';
				int i= c;
				
				char var='\u00A7';
				System.out.println(var);
				int i4=var;
				System.out.println(i4);
				
				//narrowing /explicit type casting
				
				double f1= 10.52f;
				
				long l1 = (long) f1;
				System.out.println(l1);
				
				long L2= 98654323456789l;
				
				int i23=(int) L2;
				System.out.println(i23);
				
				float f2 = 34.56f;
				int i123=(int) f2;
				System.out.println(i123);
		
	}

}
