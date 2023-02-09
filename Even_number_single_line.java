package while_loop;

public class Even_number_single_line {
 void print()
 {
	int n=1;
	int number_of_no=0;
	while(n<=200)
	{
		if(number_of_no==10)
		  {
			  break;
			  
		  }
		    
		if(n%2==0)
		{
			number_of_no++;
			System.out.print(" "+n);			
		}
		else
		  {
			//number_of_no++;
			//System.out.print(" "+n);
		  }
		
		n++;
	}
  }
 
 public static void main(String[] args)
 {
	 Even_number_single_line number=new Even_number_single_line();
	 number.print();
 }
 
 
}
