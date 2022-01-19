package com.timesheet.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import com.timesheet.timeSheetDao;
import com.timesheet.impl.TimeSheetDaoImpl;
import com.timesheet.model.TimeSheet;

class DAOTest {

	@Test
	void  connectDatabaseTest1() {
		timeSheetDao ts = new TimeSheetDaoImpl();
		Connection con = ts.connectDatabase();
		assertNotNull(con);
	}
	@Test
	void insertTimeSheetTest() {
		timeSheetDao ts = new TimeSheetDaoImpl();
		TimeSheet timeSheet = new TimeSheet();
		timeSheet.setEmpId(5000);
		long time = System.currentTimeMillis();
		timeSheet.setDate(new java.sql.Date(time));
		timeSheet.setActivity("Create a connecton method");
		timeSheet.setDescription("Write a method to return connection");
		timeSheet.setHours(1.5F);
		timeSheet.setStatus("Submitted");
		boolean flag = ts.insertTimeSheet(timeSheet);
		assertTrue(flag);
	}
	@Test
	void UpdateTimeSheetTest() {
		timeSheetDao ts = new TimeSheetDaoImpl();
		
		/*timeSheet.setEmpId(5000);
		long time = System.currentTimeMillis();
		timeSheet.setDate(new java.sql.Date(time));
		timeSheet.setActivity("Create a connector method");
		timeSheet.setDescription("Write a method to return connection");
		timeSheet.setHours(1.5F);*/
		boolean flag = ts.UpdateTimeSheet(5000);
		assertTrue(flag);
	}
	@Test
	void getTimeSheetTest() {
		timeSheetDao ts = new TimeSheetDaoImpl();
		//TimeSheet timeSheet = new TimeSheet();
		//timeSheet.setEmpId(5000);
		/*long time = System.currentTimeMillis();
		timeSheet.setDate(new java.sql.Date(time));
		timeSheet.setActivity("Create a connector method");
		timeSheet.setDescription("Write a method to return connection");
		timeSheet.setHours(1.5F);*/
		boolean flag = ts.getTimeSheet(5000);
		assertTrue(flag);
	}

}
