package com.welcome2employeewage;

import java.util.Random;
import java.util.Scanner;

public class uc8_companyname {
	public static int company(String name,int day,int wage) {
		int a;
		System.out.println("name of the company is: "+name);
		System.out.println("working days in month : "+day);
		System.out.println("wage per hour is: "+wage);
		for(int i=0;i<day;i++) {
			Random random=new Random();
			a=random.nextInt(2);
			if (a==1) {
				day++;
			}
			}
		return day;
		}
	public static void  month(int totalday, int wage) {
		System.out.println("total wage f the month is: "+totalday*wage*20);
	}
		
		//company name,wage,working hours
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("welcome to employee wage program");
		
		int totalday=0;
		for(int i=0;i<20;i++) {
			Random random=new Random();
			int a=random.nextInt(2);
			System.out.println(a);
			if(a==1) {
				totalday++;
				System.out.println(totalday);
				month(totalday*8);
				System.out.println("enter company name::");
				String cName=sc.next();
				System.out.println("enter monthly working day::");
				int mDays=sc.nextInt();
				System.out.println("enter wage per hour::");
				int whour=sc.nextInt();
				
			}
		}
	}
		
			
		}


