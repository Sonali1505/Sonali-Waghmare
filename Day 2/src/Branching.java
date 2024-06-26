
public class Branching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x= 9;
		
		if( x == 5)
			System.out.println("Value of x is  5 ");
		
	//	System.out.println("Value of x is 5");
		
int age = 200;
		
		if (age >= 18)
		{
			System.out.println("You are eligible for voting ");
			
		}
		else {
			System.out.println("sorry ! You need to wait more ");
		}
		
		int x = 8, y =7;
		int a = 10;
		int b = 11;
		
		if (x >= y) {
			System.out.println("true");
		} else {
			System.out.println("False");
			
		}
		//    10<11     10==11
		if (!(a<b ) || (a == b)) {
			System.out.println("Condition is true ");
			
		}
		else {
			System.out.println("COndition is false ");
		}
		
		
		int a =10, b= 20, c=5;
		System.out.println("The largest No is ");
		if (a > b) {
			if (a > c)
				System.out.println(a);
			
			else 
				System.out.println(c);
		} 
		else  {
			if (c> b)
				System.out.println(c);
			
			else 
				System.out.println(b);
		}
		
		
		
	}

}
