package com.timesheet;

import java.sql.Connection;
import java.util.List;

import com.timesheet.model.Employee;
import com.timesheet.model.TimeSheet;

public interface EmployeeDateDao {
	public boolean insertEmployee(Employee employee);
	public  Connection connectDatabase();
	public List<TimeSheet> getAllTimeSheet();
}
