package p0212;

import java.util.ArrayList;

public class Date_Time {
	private double time;
	private String doSomething;
	private String feelings;
	
	public void setTime(double time) {
		this.time = time;
	}
	public double getTime() {
		return time;
	}
	
	public void setDoSomething(String doSomething) {
		this.doSomething = doSomething;
	}
	public String getDoSomething() {
		return doSomething;
	}
	
	public void setFeelings(String feelings) {
		this.feelings = feelings;
	}
	public String getFeelings() {
		return feelings;
	}
	public String toString() {
		return "time : " + time + " DoSomething : " + doSomething + " setFeelings : " + feelings;
	}
}

class Date_Time2{
	public static void main(String[] args) {
		ArrayList<Date_Time> me = new ArrayList<>();
		Date_Time dt1 = new Date_Time();
		Date_Time dt2 = new Date_Time();
		Date_Time dt3 = new Date_Time();
		Date_Time dt4 = new Date_Time();
		Date_Time dt5 = new Date_Time();
		
		dt1.setTime(1.5);
		dt1.setDoSomething("코딩공부");
		dt1.setFeelings("좋음");
		
		dt2.setTime(2.5);
		dt2.setDoSomething("코딩공부");
		dt2.setFeelings("약간힘듬");
		
		dt3.setTime(4.5);
		dt3.setDoSomething("코딩공부");
		dt3.setFeelings("지침");
		
		dt4.setTime(5.5);
		dt4.setDoSomething("코딩 안공부");
		dt4.setFeelings("즐거움");
		
		dt5.setTime(6.5);
		dt5.setDoSomething("저녁먹기");
		dt5.setFeelings("편함");
		
		me.add(dt1);
		me.add(dt1);
		me.add(dt1);
		me.add(dt1);
		me.add(dt1);
	}
}
