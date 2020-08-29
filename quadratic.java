import java.util.Scanner;
import java.lang.*;

public class quadratic
{

   public static void main(String args[])
     {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Solvbing an quadratic equation");
		System.out.println("Enter the values of equation ax2+bx+c=0");
		
		int a,b,c;
		double x1,x2;
		System.out.println("Enter the values of a,b and c");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		
		int p=((b*b)-(4*a*c));
		
		if(p >0)
		{
		System.out.println("There are two possible values");
		
		x1=(((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a));
		x2=(((-b)-(Math.sqrt((b*b)-(4*a*c))))/(2*a));
		System.out.println("Now the two  values are "+x1+" and  "+x2);
		
		double ans=(a*x1*x1+b*x1+c);
		double ans1=(a*x2*x1+b*x2+c);
		
		if(ans <=0 && ans1<=0)
		  {
		  
		  System.out.println("Both the answers are correct ");
		  
		  System.exit(0);
		  
		  }
		  
		  else
		  {
		  
		  System.out.println("Something went wrong");
		 }
		 
		 }
		 
		 else if(p==0)
		 {
		 System.out.println("Only one value possible");
		 x1=(((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a));
		 
		 System.out.println("Now the value is ="+x1);
		 
		  System.out.println("Now veryfying ......");
		  		double ans=(a*x1*x1+b*x1+c);
				
				if(ans==0)
				{
				System.out.println("The answer is correct");
				System.exit(0);
				}
				else
				{
				  System.out.println("Something went wrong");
				  System.exit(0);
				  }
				  }
				  
				else
				{
				System.out.println("There are no real solutions");
				}
				}
		}
				  

		  
		  
		 
		 
		 
		 
		 
		 
		  
		  
		  
		
		
		
		
		
		
		