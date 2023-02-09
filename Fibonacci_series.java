package while_loop;

public class Fibonacci_series {
	
	void print()
	{
		int first=0;
		int second=1;
		int third=0;
		int no=1; 
		int count=17;
		 
		System.out.print(first+" "+second);
		while(no<=count)
		{
			third=first+second;
			System.out.print(" "+third);
			first=second;
			second=third;
			no++;
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibonacci_series number=new Fibonacci_series();
		number.print();
		
	}

}
