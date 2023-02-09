package while_loop;

public class Reverse_the_given_number {

 void split_reverse()	
 {
	int number=6539;
	int no=number;
	int reverse_numbers=0;
	
	while(no>=1)
	{
		int a=no%10;
		reverse_numbers=reverse_numbers*10+a;
		no=no/10;
	}
	System.out.println("reverse of the given number = "+reverse_numbers);
 }	
	
	public static void main(String[] args)
	{
		Reverse_the_given_number number=new Reverse_the_given_number ();
		number.split_reverse();
	}
	

}
