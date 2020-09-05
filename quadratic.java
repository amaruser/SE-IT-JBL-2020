/*

3) Write a Java program that prints all real solutions to
the quadratic equation ax 2 +bx+c = 0. Read in a, b, c
and use the quadratic formula. If the discriminate b 2 -
4ac is negative, display a message stating that there are
no real solutions?

*/

import java.util.Scanner;
import java.lang.*;

public class quadratic 
{
	public static void main(String[] args) 
	{ 
	Scanner sc = new Scanner(System.in);
	System.out.println("Solving quadric equation");
	System.out.println("Enter the values of eqution ax*2 +bx+c = 0");
	int a,b,c;
	double x1,x2;
	System.out.println("enter values of a,b and c");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	int p=(b*b-4*a*c);
	
	
	if(p > 0)
	{
	
		System.out.println("Two possible values are possible");
		
		x1=(((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a));
		x2=(((-b)-(Math.sqrt((b*b)-(4*a*c))))/(2*a));
		System.out.println("Now the two values are "+x1+" and "+x2);
		System.out.println("Now verifying ....");
		
		double ans=(a*x1*x1+b*x1+c);
		double ans1=(a*x2*x2+b*x2+c);
		
		if(ans <=0 && ans1 <= 0)
		{
			System.out.println("Both the answers are corect");
			System.exit(0);
			
			
		}
		else
		{
			System.out.println("Something is wrong");
			System.exit(0);
			
		}
	}
	
	else if(p==0)
		
	{
		System.out.println("only one  possible values is possible");
		x1=(((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a));
		System.out.println("Now the one value is "+x1);
		System.out.println("Now verifying ....");
		
		double ans=(a*x1*x1+b*x1+c);
		
		if(ans ==0)
		{
			System.out.println(" the answers are corect");
			System.exit(0);
			
			
		}
		else
		{
			System.out.println("Something is wrong");
			System.exit(0);
			
		}
	}
	
		
	else
	{
		System.out.println("there are no real solutions");
	}
	}
}

