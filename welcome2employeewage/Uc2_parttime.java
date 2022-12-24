package com.welcome2employeewage;

import java.util.Random;

public class Uc2_parttime {
	public static  int randomnumber(int a)
	{
	{ 
		Random random =new Random();
		a=random.nextInt(2);
		return a;
	}	

	}
	public static int randomparttime(int a) {
	
	{ 
		Random random =new Random();
		a=random.nextInt(2);
		return (a);
	}
	}
	public static void presenti(int a,int b) {
		int num=randomnumber(a);
		
	    int num1=randomparttime(a);
		if(num1==1 && num1==1)
		{
			System.out.println("Employee is Present");
			System.out.println("Wage of the day is ::"+(20*8));
			System.out.println(" Also Does Part time work");
			System.out.println("Wage of the day is as part time::"+(20*8)/2);
		}	
		else 
			if(num1==1 && num1==0) 
		{
			System.out.println(" Present ");
			System.out.println("Wage of the day is ::"+(20*8));
		}	
		else if(num1==1 && num1==0) 
			{
				System.out.println(" Part time work");
				System.out.println("Wage for the day is ::"+(20*8)/2);
			}	
		else{
			System.out.println("Employee Absent");
		}



	}

		
	public static void main(String[] args) {

		System.out.println("Wel-Come Employee Wage program");
         randomparttime(randomnumber(0));
         presenti(randomnumber(0),0);
	}
	
	
}
