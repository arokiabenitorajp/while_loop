package while_loop;

public class Even_number_of_2nd_five {
	
      void print()
      {
    	int  start_count=6;
    	int  end_count=12;
    	 int count=1;
    	 int a=1;
    	 int no=200;
    	  
    	  while(a<=no)
    	  {
    		  
    		  if(a%2==0)
    		  {
    			  if(count>= start_count )
    			  {
    				  System.out.println("even number = "+a);
    			  
    			     if(count>= end_count)
    			     {
    			    	 break;
    			     }
    			     
    			  }
    			  count++;
    		  }
    		  a++;
    	  }
    	  
      }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Even_number_of_2nd_five number=new Even_number_of_2nd_five ();
		number.print();
		
	}

}
