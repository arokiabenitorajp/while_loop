package while_loop;

public class Multiple_of_7 {
	
	void print ()
	{
		int no_of_count=0;
		int a=1;
		while(a<=100)
		{
			if(a%7==0 && a%2==0)
			{
				no_of_count++;
				System.out.println(a);
			}
			a++;
		}
			
			 
			 System.out.println( " Total number divisible of both 2 and 7 = "+no_of_count);
		}
	
	
		 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Multiple_of_7 obj= new Multiple_of_7(); 
           obj.print();
	}

}
