
/*
1) Implement a java program to calculate gross salary
& net salary taking the following data.
Input: empno, empname, basic
Process:
DA=70% of basic
HRA=30% of basic
CCA=Rs240/-
PF=10% of basic
PT= Rs100/-

*/

import java.util.*;
public class grossSalary 
{
	public static void main(String[] args) 
	{ 
	Scanner sc = new Scanner(System.in);
	
	String eno,name;
	int basic;
	System.out.println("Enter employee number:");
	eno=sc.nextLine();
	
	System.out.println("Enter name:");
	name=sc.nextLine();
	
	System.out.println("Enter his/her basic salary in rs:");
	basic=sc.nextInt();
	
	
	float da=((basic*70)/100);
	float hra=((basic*30)/100);
	float cca=240;
	float pf=((basic*70)/100);
	float pt=100;
	
	float gross=da+hra-cca-pf-pt+basic;
	System.out.println("---------**************-------------");
	System.out.println("Gross salry is of employee "+name+ " and his/her e no is");
	System.out.println(eno+" \n");
	System.out.println("Total salary is ="+gross);
	
	
	
	}
	

}
