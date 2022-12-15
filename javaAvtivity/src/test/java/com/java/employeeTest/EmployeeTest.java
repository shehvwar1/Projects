package com.java.employeeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.java.Employee.EmployeeDetails;
import com.java.Employee.EmployeeLogic;

public class EmployeeTest {
	EmployeeDetails eds = new EmployeeDetails();
	EmployeeLogic elg = new  EmployeeLogic();
	
	@Test
	public void appraisalCalculationTest()
	{
		eds.setEmpName("Subuhi");
		eds.setAge(23);
		eds.setMonthlySalary(15000);
		
		double appraisalAmt = elg.appraisalAmount(eds);
		assertEquals(1000,appraisalAmt, 0.0);
	}
	//trying to give appraisal amount for higher salary
	@Test
	public void appraisalCalculationTestTwo()
	{
		eds.setEmpName("Shehvwar");
		eds.setAge(24);
		eds.setMonthlySalary(15000);
		
		double appraisalAmt = elg.appraisalAmount(eds);
		assertEquals(500,appraisalAmt, 0.0);
	}
	//giving monthly salary 10000
	//trying to give appraisal amount for higher salary
		@Test
		public void appraisalCalculationTestThree()
		{
			eds.setEmpName("Ruhi");
			eds.setAge(27);
			eds.setMonthlySalary(10000);
			
			double appraisalAmt = elg.appraisalAmount(eds);
			assertEquals(500,appraisalAmt, 0.0);
		}
	

}
