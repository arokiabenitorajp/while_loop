package while_loop;

public class Amstrong_number {
	static int limit=1000;
	void print_1()
	{
		int no=1;
		int list=123;
		int digits=0;
		int unit_digit=0;
		//while(no<=limit)
		//{
			while(list>=1)
			{
				unit_digit=list%10;
				System.out.println(unit_digit);
				list=list/10;
				digits++;
				
			}
			System.out.println(digits);
			//  while(list>=1)
			//  {
				//  unit_digit=no%10;
					
				  
			 // }
			//no++;
		//}
	}
	
	
	      
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amstrong_number number=new Amstrong_number();
		number.print_1();
		//number.print2();
		
	}

}
