package while_loop;

public class Lcm {
	void print(int a,int b)
	{ 
		//int a=8;
		//int b=2;
		int large=0;
		int small=0;
		int no;
		if(a>b)
		{
			large=a;
			small=b;
			//System.out.println(a);
			//System.out.println(b);
			 no=large;
		}
		else
		{
			large=b;
			small=a;
			//System.out.println(a);
			//System.out.println(b);
			no=large;
		}
		  while(no>=large)
		  {
			  //System.out.println(no);
			  if(no%large==0 && no%small==0)
			  {
				  System.out.println(no);
				  break;
				  
			  }
			  no=no+large;
		  }
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lcm number=new Lcm ();
	   number.print(41,981);
		
	}

}
