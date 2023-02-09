package while_loop;

public class Sum_of_numbers {
	
	
	void print()
	{
		
	int purse=0;
	
	int day=1;
	
	
	while (day<=10)
	{
		
		purse=purse+day;
			
			day++;
		
		
	}
	  System.out.println(purse);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum_of_numbers numbers=new Sum_of_numbers ();
		
		numbers.print();
	}

}
