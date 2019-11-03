package school_timetable;

import java.util.ArrayList;
import java.util.List;

public class Course 
{
	String name;
	List<CourseAction> actions;
	
	public Course(String name) {
		this.name = name;
		actions = new ArrayList<CourseAction>();		
	}
	
	
}
