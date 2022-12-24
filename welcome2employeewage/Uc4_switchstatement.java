package com.welcome2employeewage;

import java.util.Random;

public class Uc4_switchstatement {
;



	public static int randomnumber(int a) {
		Random random=new Random();
		a=random.nextInt(2);
		return a;
	}
	public static int randomparttime(int a) {
		Random random=new Random();
		a=random.nextInt(2);
		return (a);
	}
public static void present(int a) {
	
	if (a==1) {
		System.out.println("employee present and part time");
		System.out.println("part time wage is: " +(20*8)/2);
	}
	else 
	{
		System.out.println("employee is absent");
		System.out.println("part time wage is: " +0);
	}

}
	public static void wage(int a) {
	switch(a) {
		case 1:
		System.out.println("employee is present and part time");
		System.out.println("partime wage is: " +(20*8)/2);
		break;
		
	case 2:
		System.out.println("employee is absent");
		System.out.println("wage is:" +0);
	break;
	}
	}
	
	
	

	public static void main(String[] args) {
		System.out.println("employee is present and part time");
		randomparttime(1);

	}

}
