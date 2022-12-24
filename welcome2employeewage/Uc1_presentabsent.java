package com.welcome2employeewage;

import java.util.Random;

public class Uc1_presentabsent {
	public static int randomnumber (int a){
		Random random=new Random();
		a=random.nextInt(2);
		return a;
	}
	
	public static void presenti(int a) {
		int num=randomnumber(a);
		
	
	if(num==1) 
		System.out.println("employee is present");
	
	else
	
		System.out.println("employee is absent");
	}
	public static void main(String[] args) {
		System.out.println("welcome to employee wage computation program in oops");
		presenti(randomnumber(0));

	}

}
