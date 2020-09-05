/*

2) Five Bikers Compete in a race such that they drive
at a constant speed which may or may not be the sameII
Classes, objects,
Arrays and Strings
as the other. To qualify the race, the speed of a racer
must be more than the average speed of all 5 racers.
Write a Java program to take as input the speed of each
racer and print back the speed of qualifying racers.

*/
import java.util.*;
public class racerWA
{
	public static void main(String[] args) 
	{ 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter speed of every racer(all 5)");
	float a,b,c,d,e;
	float total=0;
	
	
	a=sc.nextFloat();
	b=sc.nextFloat();
	c=sc.nextFloat();
	d=sc.nextFloat();
	e=sc.nextFloat();
	
	float avg=(a+b+c+d+e)/5;
	System.out.println("Avg is "+avg);
	
	
	if(a>avg)
	System.out.println("Yes,he is qualified :"+a);
 	if(b>avg)
	System.out.println("Yes,he is qualified :"+b);
 	if(c>avg)
	System.out.println("Yes,he is qualified :"+c);
	if(d>avg)
	System.out.println("Yes,he is qualified :"+d);
	 if(e>avg)
	System.out.println("Yes,he is qualified :"+e);
	
	
	}
	}
	
	
	
	
	
