package while_loop;

public class Neon_number {
	void print()
	{
		int no=9;
		int product=no;
		int reverse=0;
		product=product*no;
		System.out.println(product);
		 while(product>=1)
		 {
			 int num=product%10;
			  reverse=reverse+num;
			  product=product/10;
		 }
		    if(no==product)
		    {
		    	System.out.println(no +"is neon number");
		    }
		      else
		      {
		    	  System.out.println(no +"is not neon number");
		      }
		 System.out.println(reverse);
		 
	}

	public static void main(String[] args) 
	{
		Neon_number number=new Neon_number();
		 number.print();
				
	}

}
