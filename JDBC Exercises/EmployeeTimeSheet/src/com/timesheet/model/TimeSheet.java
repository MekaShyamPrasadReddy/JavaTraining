package com.timesheet.model;

public class TimeSheet {
	private int timesheetid;
	private int empId;
	private java.util.Date date;
	private String activity;
	private String description;
	private float hours;
	private String status;
	public int gettimesheetId() {
		return timesheetid;
	}
	public void settimesheetId(int timesheetid) {
		this.timesheetid = timesheetid;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getHours() {
		return hours;
	}
	public void setHours(float hours) {
		this.hours = hours;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
