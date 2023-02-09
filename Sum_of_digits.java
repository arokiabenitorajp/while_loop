package while_loop;

public class Sum_of_digits {
	
	void split_reverse_sum()	
	 {
		int number=9532;
		int no=number;
		int reverse_numbers=0;
		int sum_of_digits=0;
		int no_of_digits=0;
		while(no>=1)
		{
			int a=no%10;
			reverse_numbers=reverse_numbers*10+a;
			sum_of_digits=sum_of_digits+a;
			
			no=no/10;
			no_of_digits++;
		}
		System.out.println("reverse of the given number = "+reverse_numbers);
		System.out.println("sum of the digits of given numbers = "+sum_of_digits);
		System.out.println("sum of the digits of given numbers = "+no_of_digits);
		//System.out.println("sum of the digits of given numbers = "+reverse_numbers2);
	 }	
		
		public static void main(String[] args)
		{
			Sum_of_digits number=new Sum_of_digits ();
			number.split_reverse_sum();
		}
		
}
	



