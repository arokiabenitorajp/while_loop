package while_loop;

public class Add_multiple_of_5_single_line {
	void print()
	{
	  int no=1;
	  //int Add_multiple_of_5=0;
	  int number_of_no=0;
	 // int multiple_number=5;
		while(no<=100)
		{
			if (number_of_no==10)
			{
				break;
			}
						   
			   if (no%5==0 || no==1)
			   {
				   
				   //Add_multiple_of_5= multiple_number+no;
				   System.out.print(" "+no);
				   number_of_no++;
			   }
			        
			   no++;
		}
	}
	public static void main(String[] args)
	{
		Add_multiple_of_5_single_line number=new Add_multiple_of_5_single_line();
		
		number.print();
	}
}
