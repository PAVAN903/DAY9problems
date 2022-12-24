package com.welcome2employeewage;

import java.util.Random;

public class Uc5_monthwage_ {
	
	public static int randomnumber(int a) {
		Random random=new Random();
		a=random.nextInt(2);
		return a;
	}
	public static int randomparttime(int a) {
		Random random=new Random();
		a=random.nextInt(2);
		return a;
	}
	public static void monthwage(int a) {
		int num=randomnumber(a);
		switch(num) {
		case 1:
			System.out.println("employee is present");
			System.out.println("wage of the day is : "+(20*8));
			break;
		case 2:
			System.out.println("employee is part time");
			System.out.println("wage of the day is : "+(20*8)/2);
			break;
		}
	}

	public static void main(String[] args) {
		System.out.println("employee wage for the month");
		monthwage(randomnumber(0));
		
		int day=0;
		for(int i=0;i<20;i++) {
			Random random=new Random();
			int a=random.nextInt(2);
			if (a==1) {
				day++;
				
			}
		}
              System.out.println("total wage for month is: " +day*20*8);
	}

}
