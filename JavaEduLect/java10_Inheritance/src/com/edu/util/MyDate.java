package com.edu.util;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	
	public MyDate( ) {};
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		return year + "-" + month + "-" + day; //Object 상속받은 것을 입맛에 맞게 바꾸는 것 '오버라이딩'
	}
}
