/**
 * 
 */
package com.welcome2employeewage;

import java.util.Random;

public class Uc2_dailywage {
	public static  int randomnumber(int a)
	{
		Random random =new Random();
		a=random.nextInt(2);
		return a;
		
	}
	public static void presenti(int a) {
		int num=randomnumber(a);
		if(num==1)
		if(num==2) 
		{
			System.out.println(" Present");
		}
		else
		{
			System.out.println("Wage of the day is ::"+(20*8));
		}
		
		else 
		{
			System.out.println(" Absent");
		}

		}

	
	public static void main(String[] args) {

		System.out.println("Wel-Come In Employee Wage Computation");
         presenti(randomnumber(0));
	}

	

 
 

	}


