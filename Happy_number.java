package while_loop;

import java.util.Scanner;

public class Happy_number {
	static int sum;
	public void print(int num)
	{
 
  int a=0;
  int b=0;
   while(num>0)
   {
	 a=num%10;
	sum=sum+(a*a);
	num=num/10;
	   
   }
   System.out.println(sum);

   while(sum>0)
   {
	 b=sum%10;
	sum=sum+(b*b);
	sum=sum/10;
	   
   }
   System.out.println(sum);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Happy_number number=new Happy_number();
		System.out.println("please enter number");
		
		Scanner sc=new Scanner(System.in);
		sc.close();
		int a=sc.nextInt();
		
		number.print(a);	
  }
}
