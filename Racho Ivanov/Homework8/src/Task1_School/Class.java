package Task1_School;

import java.util.List;

public class Class
{
	private final String name;
	private List<Student> students;
	private  List<Teacher> teachers;

	public Class(String name, List<Student> students, Teacher... teachers)
	{
		this.name = name;
		this.students = students;
		for (Teacher t: teachers)
		{
			this.teachers.add(t);
		}
	}

	public String getName()
	{
		return name;
	}

	public List<Student> getStudents()
	{
		return students;
	}

	public boolean addStudent(Student s)
	{
		if (hasStudent(s))
			return false;
		students.add(s);
		return true;
	}

	public boolean hasStudent(Student stud)
	{
		for (Student s : students)
		{
			if(s.getName() == stud.getName()&& s.getId() == stud.getId())
				return true;
		}
		return false;
	}
}
