package school_timetable;

public class Student extends Person
{
	int year;
	
	public Student(String name, int year) 
	{
		super(name);
		this.year = year;
	}
}
