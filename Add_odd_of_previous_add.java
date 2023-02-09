package while_loop;

public class Add_odd_of_previous_add {
	
	void show()
	{
		int no=2;
		int number_of_no=0;
		int add_odd=0;
		while(no<=100)
		{
		  if(number_of_no==10)
		  {
			  break;
		  }
			if(no%2==0)
			{
				
			}
			else
			{
				System.out.println("add odd number= "+add_odd);
				add_odd=add_odd+no;
				
				number_of_no++;
				
			}
			 no++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add_odd_of_previous_add number=new Add_odd_of_previous_add ();
		number.show();

	}

}
