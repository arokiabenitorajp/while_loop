package while_loop;

public class Number_while {

	void print (int a,int b,int c)
	{
		while(a<=10)
		{
			System.out.println(a);
			 a++;
		}
		 
	       while(b>=1)
		   {
			System.out.println(b);
			 b--;
		   }
		 
		       while(c<=20)
		       {
			    System.out.println(c);
			    c=c+2;
		       }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Number_while number=new Number_while();
		number.print(1,10,2);
	}
	

}
