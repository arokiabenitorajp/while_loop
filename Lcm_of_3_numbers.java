package while_loop;

public class Lcm_of_3_numbers {
   void print(int a,int b,int c)
   {
	   int large=0;
	   int number_2=0;
	   int number_3=0;
	   int no=0;
	     if(a>b && a>c)  //in this if condition to find a is grater than b and c,weather a is greater then a is the large number
	     {
	    	 large=a;
	    	 number_2=b;
	    	 number_3=c;
	    	 no=large;
	     }
	       if(b>a && b>c)  //in this if condition to find b is grater than a and c,weather b is greater then b is the large number
	       {
	    	   large=b;
		    	 number_2=a;
		    	 number_3=c;
		    	 no=large;
	       }
	       else   //in this if condition to find c is grater than a and b,weather c is greater then c is the large number
	         {
	    	   large=c;
		    	 number_2=a;
		    	 number_3=b; 
		    	 no=large;
	         }
	       while(no>=large)
			  {
				  if(no%large==0 && no%number_2==0 && no%number_3==0) //the input is three number,so use "and" logic gate in between three number
				  {
					  System.out.println(no);
					  break;
					  
				  }
				  no=no+large;
			  }
	    	   
   }
	
	
	public static void main(String[] args)
	{
		Lcm_of_3_numbers number=new Lcm_of_3_numbers ();
		number.print(2,8,10);
	}

}
