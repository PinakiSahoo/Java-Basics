package com.pinx.test;

import com.pinx.support.Date;

public class Record {
	Date startdate;
	Date endDate;
	int exectedOutput;
	
	public Record() {
		// TODO Auto-generated constructor stub
	}

	public Record(Date startdate, Date endDate, int exectedOutput) {
		super();
		this.startdate = startdate;
		this.endDate = endDate;
		this.exectedOutput = exectedOutput;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getExectedOutput() {
		return exectedOutput;
	}

	public void setExectedOutput(int exectedOutput) {
		this.exectedOutput = exectedOutput;
	}
	
	

}



