package school_timetable;

public class TimeSlot 
{
	int hour;
	int minute;
	int day;
	int month;
	int year;
	int duration; //in minutes
	
	public TimeSlot(int hour, int minute, int day, int month, int year, int duration) {
		this.hour = hour;
		this.minute = minute;
		this.day = day;
		this.month = month;
		this.year = year;
		this.duration = duration;
	}	
}
