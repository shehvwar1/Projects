package com.java.Employee;

public class EmployeeLogic {
	public double calculateYearlySalary(EmployeeDetails ed)
	{
		double yearSalary = 0;
		yearSalary = ed.getMonthlySalary()*12;
		return yearSalary;
		
	}
	public double appraisalAmount(EmployeeDetails ed)
	{
		double appraisalAmount = 0;
		if(ed.getMonthlySalary()  <= 10000)
		{
			appraisalAmount = 500;
		}
		else
		{
			if(ed.getMonthlySalary()  <= 120000)
			{
				appraisalAmount = 1000;
			}
		}
		return appraisalAmount;
		
	}
}
