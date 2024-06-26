
public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++)
		{
			System.out.println("Value of i :" + i);
		}
		
		
		//program to print the multiplication tables
				//in a given range by using nested forloop 
				int beg=10;
				int end=20;
				
				for(int  i=beg; i <=end; i++ )
				{
					for(int j=1; j<=10; j++)
					{
						System.out.println(i + "*" + j + "=" + i*j);
						
					}
					
					System.out.println();
				}
				
				
				int i=101;
				
				while (i<=100)
				{
					System.out.println(i);
					i++;
				}

				int i=11;
				do {
					System.out.println(i);
					i++;
				}
				while (i <=1);
				
				
				int a[] = {10,20,30,40,50};
				
				//	for integer array 
					for(int i : a  )
					{
						System.out.println(i);
					}
					
					char ch[] = {'j','a','v','a'};
					for (char c : ch)
					{
						System.out.println(c);
					}
					
					String s1[] = {"Java", "Programming", "Learning"};
					
					for(String s: s1)
					{
						System.out.print(s+" ");
					}
					
					
	}

}
