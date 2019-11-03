package school_timetable;

public class Teacher extends Person
{
	String degree; // Doctor of Philosophy = PhD, Doctor of Science = Sc.D.

	public Teacher(String name, String degree) 
	{
		super(name);
		this.degree = degree;
	}
}
