package com.employeewage;
import java.util.Random;

public class EmployeeWageComputation {
	static final int IS_FULL_TIME = 1;
	static final int EMP_RATE_PER_HR = 20;
	
	public static int empCheckStatus() {
		int empWrkHrs = 0;
		Random random = new Random();
		int empCheck = random.nextInt(2);
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
			empWrkHrs = 8;
		}
		else {
			System.out.println("Employee is absent");
			empWrkHrs = 0;
		}
		return empWrkHrs;
	}
	
	public static int empWagePerDayStatus(int empWrkHrs) {
		int empWagePerDay = empWrkHrs * EMP_RATE_PER_HR;
		return empWagePerDay;
	}

	public static void main(String[] args) {	
		int empWrkHrs;
		int empWagePerDay;
		empWrkHrs = empCheckStatus();
		empWagePerDay = empWagePerDayStatus(empWrkHrs);
		System.out.println("Employee Wage per day: "+empWagePerDay);
		
	}

}
