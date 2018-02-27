package Task1_School;

public class Student
{
	private final String name;
	private final String id;
	private Class schoolClass;

	public String getName()
	{
		return name;
	}

	public String getId()
	{
		return id;
	}

	public Class getSchoolClass()
	{
		return schoolClass;
	}

	public Student(String name, String id)
	{
		this.name = name;
	}

	public void setSchoolClass(Class schoolClass)
	{
		this.schoolClass = schoolClass;
	}

	public boolean changeClass(Class c)
	{
		if (c!= null && c!= getSchoolClass())
		{
			this.schoolClass = c;
			return true;
		}
		return false;
	}
}
