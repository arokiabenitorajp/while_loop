package while_loop;

public class Sum_of_first_10_odd_numbers {

	void print()
	{
		int no=1;
		int number_of_no=0;
		int sum_of_odd=0;
		  while(no<=500)
		  {
			  if(number_of_no==10)
			  {
				  break;
				  
			  }
			      if(no%2==0)
			      {
				     // number_of_no++;
				    //  sum_of_even=sum_of_even+no;
				  //  System.out.println("even number = "+no);
			      }
			      else
			        {
			    	  number_of_no++;
				      sum_of_odd=sum_of_odd+no;
				      System.out.println(" odd number = "+no);
			    	  
			        }
			  no++;
		  }
			
		  System.out.println("Sum_of_first_10_even_numbers = "+sum_of_odd);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum_of_first_10_odd_numbers number=new Sum_of_first_10_odd_numbers();
		number.print();
	}

}


