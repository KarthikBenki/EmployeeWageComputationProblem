package com.employeewage;
import java.util.Random;

public class EmployeeWageComputation {
	static final int IS_FULL_TIME = 1;
	
	public static void empCheckStatus() {
		Random random = new Random();
		int empCheck = random.nextInt(2);
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is absent");
		}
	}

	public static void main(String[] args) {		
		empCheckStatus();				
	}

}
