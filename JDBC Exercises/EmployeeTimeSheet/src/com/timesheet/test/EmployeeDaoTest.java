package com.timesheet.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import com.timesheet.EmployeeDateDao;
import com.timesheet.timeSheetDao;
import com.timesheet.impl.EmployeeDateDaoImpl;
import com.timesheet.impl.TimeSheetDaoImpl;
import com.timesheet.model.Employee;

class EmployeeDaoTest {

	@Test
	void connectDatabaseTest1() {
		timeSheetDao ts = new TimeSheetDaoImpl();
		Connection con = ts.connectDatabase();
		assertNotNull(con);
	}
	@Test
	void insertEmployeeTest() {
		EmployeeDateDao ts = new EmployeeDateDaoImpl();
		Employee employee = new Employee();
		employee.setEmpId(21465);
		long time = System.currentTimeMillis();
		employee.setDate(new java.sql.Date(time));
		employee.setEmailId("shyamprasad.r@sonatasoftware");
		employee.setEmpName("Meka Shyamprasad Reddy");		
		employee.setHcc("Submitted");
		boolean flag = ts.insertEmployee(employee);
		assertTrue(flag);
	}

}
