package com.timesheet.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.timesheet.EmployeeDateDao;
import com.timesheet.model.Employee;
import com.timesheet.model.TimeSheet;

public class EmployeeDateDaoImpl implements EmployeeDateDao {

	@Override
	public boolean insertEmployee(Employee employee) {
		Connection con = connectDatabase();
		int rows=0;
		boolean flag = false;
		try {
			PreparedStatement ps = con.prepareStatement("insert into employee (empid, date,empName, emailId ,hcc ) values(?,?,?,?,?)");
			ps.setInt(1, employee.getEmpId());
			ps.setDate(2, (java.sql.Date)employee.getDate());
			ps.setString(3, employee.getEmpName());
			ps.setString(4,  employee.getEmailId());
			ps.setString(5, employee.getHcc());			
			rows = ps.executeUpdate();
			if (rows > 0) flag = true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public Connection connectDatabase() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Vista$123s");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

	@Override
	public List<TimeSheet> getAllTimeSheet() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
