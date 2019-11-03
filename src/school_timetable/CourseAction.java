package school_timetable;

public class CourseAction
{
	ActionType type;
	TimeSlot time;
	Teacher teacher;
	Student[] students;
	SchoolRoom room;
	
	public CourseAction(ActionType type, TimeSlot time, Teacher teacher, SchoolRoom room) {
		this.type = type;
		this.time = time;
		this.teacher = teacher;
		this.students = new Student[room.capacity];
		this.room = room;
	}
}
