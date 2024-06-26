
public class jumping_statements {
	public static void main(String args[]) {
		for(int i =5; i< 10 ; i++)
		{
			if (i == 5)
				//break;
			System.out.println(i);
			System.out.println("Helo Friends ");
			break;
			
		}
		
		for (int k=5; k<15; k++)
		{
			//odd no are skipped
			
			if (k%2 !=0)
				continue;
			//Even number are printed 
			System.out.println(k + "");
		}
	}
}
