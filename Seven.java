package while_loop;

public class Seven {
	void show()
	{
	int count=0;
	int no=1;
	while (no<=1117)
	{
		if(no%7==0)
		{
			count++;
		}
		no++;
	}
	  System.out.println(count);
	}
	
	/*void show_1()
	{
		
	int purse=0;
	
	int day=1;
	
	
	while (day<=10)
	{
		
		purse=purse+day;
			
			day++;
		
		
	}
	  System.out.println(purse);
	}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seven obj=new Seven ();
       obj.show();
       // obj.show_1();
	}

}
