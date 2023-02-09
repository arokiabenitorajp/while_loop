package while_loop;

public class Add_odd_number_single_number {
	void print()
	{
		int no=1;
		int add_odd_number=0;
		
		while(no<=15)
		{
			if(no%2==0)
			{
				
			}
			else
			  {
				add_odd_number=add_odd_number+no;
				System.out.print(" "+add_odd_number);
			  }
			no++;
		}
		
	}
      
	public static void main(String[] args)
	{
		
		Add_odd_number_single_number number=new Add_odd_number_single_number();
		number.print();
	}
}
