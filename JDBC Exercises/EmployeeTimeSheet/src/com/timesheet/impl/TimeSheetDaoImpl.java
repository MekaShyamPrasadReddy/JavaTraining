package com.timesheet.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.timesheet.timeSheetDao;
import com.timesheet.model.TimeSheet;

public class TimeSheetDaoImpl implements timeSheetDao {

	@Override
	public boolean insertTimeSheet(TimeSheet timeSheet) {
		Connection con = connectDatabase();
		int rows=0;
		boolean flag = false;
		try {
			PreparedStatement ps = con.prepareStatement("insert into timesheet (empid, date, activity, description, hours, status) values(?,?,?,?,?,?)");
			ps.setInt(1, timeSheet.getEmpId());
			ps.setDate(2, (java.sql.Date)timeSheet.getDate());
			ps.setString(3, timeSheet.getActivity());
			ps.setString(4,  timeSheet.getDescription());
			ps.setFloat(5, timeSheet.getHours());
			ps.setString(6, timeSheet.getStatus());
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
		Connection con = connectDatabase();
		List<TimeSheet> list= new ArrayList<TimeSheet>();
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from timesheet");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				TimeSheet ts = new TimeSheet();
				ts.settimesheetId(rs.getInt("timesheetid"));
				ts.setEmpId(rs.getInt("empid"));
				ts.setDate(rs.getDate("date"));
				ts.setActivity(rs.getString("activity"));
				list.add(ts);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public boolean UpdateTimeSheet(int empid) {
		Connection con = connectDatabase();
		int rows=0;
		boolean flag = false;
		try {
			PreparedStatement ps = con.prepareStatement(" update timesheet SET status ='Approved' WHERE empid=5000");
			/*ps.setInt(1, timeSheet.getEmpId());
			ps.setDate(2, (java.sql.Date)timeSheet.getDate());
			ps.setString(3, timeSheet.getActivity());
			ps.setString(4,  timeSheet.getDescription());
			ps.setFloat(5, timeSheet.getHours());*/
			
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
	public boolean getTimeSheet(int empid) {
		Connection con = connectDatabase();
		boolean flag = false;
		
		try {
			TimeSheet ts = new TimeSheet();
			PreparedStatement ps = con.prepareStatement("select * from timesheet where empid=5000");
			ResultSet rs= ps.executeQuery();
			if (rs.next()  ) flag = true;
				ts.setEmpId(rs.getInt("empid"));
				//ts.setDate(rs.getDate("date"));
				//ts.setActivity(rs.getString("activity"));*/
				//int empid = rs.getInt("empid");
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		
	}

}
