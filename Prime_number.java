package while_loop;

public class Prime_number {
	void print()
	{
		int no=1;
		int divisor=2;
		 int divisor_count=0;
		 while(no<=10)
		 {
		 while(divisor<=no)
		 {
			 if(no%divisor==0)
			 {
				 divisor_count++;
			 }
	        
			divisor++;
		 }
		 if(divisor_count==1)
		  {
			  
			  System.out.println(no+" is prime number");
		  }
		   else
		   {
			   System.out.println(no+" is not prime number");
		   }
		 no++;
	 
	   
	 }
	}
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prime_number number=new Prime_number ();
		number.print();
	}

}
