package com.welcome2employeewage;

import java.util.Random;

public class Uc6_workinghour100 {
	public static void month(int hour) {
		if(hour>100) {
			System.out.println("total wage for month of employee is: "+hour*20);
		}
		else {
			System.out.println("employe have not attended required hour");
			
		}
	}

	public static void main(String[] args) {
		System.out.println("welcome to employee wage program");
		int day=0;
		for(int i=0;i<20;i++) {
			Random random=new Random();
			int a=random.nextInt(2);
			System.out.println(a);
			if(a==1) {
				day++;
				System.out.println(day);
				
			}
		}
		System.out.println("total wage of the month is: "+day*20*8);
		month(day*8);

	}

}
