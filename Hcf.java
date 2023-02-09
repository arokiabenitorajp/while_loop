package while_loop;

public class Hcf {
	
	void print(int a,int b)
	{ 
		int large=0;
		int small=0;
		int no=1;
		int hcf=0;
		if(a>b)
		{
			large=a;
			small=b;
			
		}
		else
		{
			large=b;
			small=a;
		}
		  while(no<=small)
		  {
			  if(small%no==0 && large%no==0)
			  {
				  hcf=no;
				  
			  }
			  no++;
		  }
		  System.out.println(hcf);
	}
	
	public static void main(String[] args)
	
	{
		Hcf number=new Hcf();
		number.print(96,40);
	}
}
	
	
	