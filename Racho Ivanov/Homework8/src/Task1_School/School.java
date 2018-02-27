package Task1_School;

import java.util.ArrayList;
import java.util.List;

public class School
{
	private List<Teacher> teachers;
	private List<Student> students;
	private List<Class> classes;

	public School()
	{
		this.teachers = new ArrayList<>();
		this.students = new ArrayList<>();
		this.classes = new ArrayList<>();
	}

	public boolean hireTeacher(Teacher newT)
	{
		for (Teacher t: this.teachers)
		{
			if (t.isHired(newT.getName()))
				return false;
		}
		this.teachers.add(newT);
		return true;
	}

	public boolean fireTeacher(Teacher fireT)
	{
		for (Teacher t: teachers)
		{
			if (!t.isHired(fireT.getName()))
			{
				teachers.remove(fireT);
				return true;
			}
		}
		return false;
	}

	public boolean enlistStudent(Student newS)
	{
		for (Student s: students)
		{
			if (newS == s)
				return false;
		}
		students.add(newS);
		return true;
	}

	public boolean expellStudent(Student expS)
	{
		for (Student s: students)
		{
			if (expS.getId() == s.getId() && expS.getName() == s.getName())
			{
				students.remove(expS);
				return true;
			}
		}
		return false;
	}


}
