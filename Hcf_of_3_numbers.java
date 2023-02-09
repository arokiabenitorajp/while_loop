package while_loop;

public class Hcf_of_3_numbers {
     
	void print()
	{
		int a=17;
		int b=767;
		int c=18;
		   int small=0;
		   int number_2=0;
		   int number_3=0;
		   int no=1;
		   int hcf=0;
		    
		   if(a<b && a<c)
		   {
			   small=a;
			   number_2=b;
			    number_3=c;
			   
		   }
		      if(b<a && b<c)
		      {
		    	  
		    	  small=b;
				   number_2=a;
				    number_3=c;
				   
		      }
		          else
		           {

			    	  small=c;
					   number_2=a;
					    number_3=c;
					   
		            }
			   
		    
		       while(no<=small)
				  {
		    	   //System.out.println(small);
					  if(small%no==0 && number_2%no==0 && number_3%no==0)
					  {
						  hcf=no;
						  
					  }
					  no++;
				  }
				  System.out.println(hcf);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hcf_of_3_numbers number=new Hcf_of_3_numbers();
		number.print();
		
		
	}

}
