package com.cdac.sameekshak.helper;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.cdac.sameekshak.entities.Test;

public class TestTimer {

	public String sysTime="";
	public String startTime="";
	public Thread t;
	public TestTimer() {

		sysTime=getTime();
		startTime=sysTime;

	}
	public String getTime() {

		Calendar calendar = new GregorianCalendar();
		String am_pm;
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		if(calendar.get(Calendar.AM_PM) == 0)
			am_pm = "AM";
		else
			am_pm = "PM";
		String hr=""+hour,mm=""+minute,ss=""+second;
		if(hr.length()==1)
			hr="0"+hr;
		if(mm.length()==1)
			mm="0"+mm;
		if(ss.length()==1)
			ss="0"+ss;
		String time=hr + ":"+ mm + ":" + ss;
		return time;
	}


	public String dateFormater(String time){
		StringBuffer sb=new StringBuffer(time);
		if(sb.charAt(2)!=':'){
			sb.insert(0, '0');
		}
		if(sb.charAt(5)!=':'){
			sb.insert(3, '0');
		}
		if(sb.length()!=8){
			sb.insert(6, '0');
		}

		time=sb.toString();
		return time;
	}
	
	public String parse_Time_Min(String studentTime,String currentTime, int maxTime){

		int hr1=Integer.parseInt(currentTime.substring(0, 2));
		int mm1=Integer.parseInt(currentTime.substring(3, 5));
		int ss1=Integer.parseInt(currentTime.substring(6, 8));



		int hr2=Integer.parseInt(studentTime.substring(0, 2));
		int mm2=Integer.parseInt(studentTime.substring(3, 5))+maxTime;
		int ss2=Integer.parseInt(studentTime.substring(6, 8));

		String ss,mm,hr;
		if(mm2>=60){
			hr2=mm2/60;
			mm2=mm2%60;
		}

		if(ss2<ss1) {
			mm2=mm2-1;
			ss2=ss2+60;
		}

		ss=""+(ss2-ss1);

		if(ss.length()==1)
			ss="0"+ss;


		if(mm2<mm1) {
			hr2=hr2-1;
			mm2=mm2+60;
		}

		mm=""+(mm2-mm1);

		if(mm.length()==1)
			mm="0"+mm;

		hr="0";

		if(hr.length()==1)
			hr="0"+hr;


		String newTime=hr+":"+mm+":"+ss;


		/*
		if((hr.equals("00"))&&(mm.equals("00"))&&(ss.equals("01"))){
			newTime="TimeOut";
		}*/

		System.out.println("");
		return newTime;
	}

	public String parse_Time(String studentTime,String currentTime, int maxTime, int read){

		int hr1=Integer.parseInt(currentTime.substring(0, 2));
		int mm1=Integer.parseInt(currentTime.substring(3, 5))+read;
		int ss1=Integer.parseInt(currentTime.substring(6, 8));
		//System.out.println("Time 1 === "+hr1+":"+mm1+":"+ss1);
		if(mm1>=60){
			hr1=hr1+mm1/60;
			mm1=mm1%60;
		}

		int hr2=Integer.parseInt(studentTime.substring(0, 2));
		int mm2=Integer.parseInt(studentTime.substring(3, 5))+maxTime;
		int ss2=Integer.parseInt(studentTime.substring(6, 8));
		//System.out.println("Time 2 === "+hr2+":"+mm2+":"+ss2);

		String ss="",mm="",hr="";
		if(mm2>=60){
			hr2=hr2+mm2/60;
			mm2=mm2%60;
		}
		//if(!((ss2-ss1)==0)&&((mm2-mm1)==0)&&((hr2-hr1)==0)){
			if(ss2<ss1) {
				mm2=mm2-1;
				ss2=ss2+60;
			}

			ss=""+(ss2-ss1);

			if(ss.length()==1)
				ss="0"+ss;


			if(mm2<mm1) {
				hr2=hr2-1;
				mm2=mm2+60;
			}

			mm=""+(mm2-mm1);

			if(mm.length()==1)
				mm="0"+mm;

			hr=""+(hr2-hr1);

			if(hr.length()==1)
				hr="0"+hr;
		//}
		String newTime=hr+":"+mm+":"+ss;
		//System.out.println("final time = "+newTime);
		return newTime;
	}
}	
