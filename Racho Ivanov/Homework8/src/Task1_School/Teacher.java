package Task1_School;

import java.util.ArrayList;
import java.util.Arrays;

public class Teacher
{
	//Защо, когато направя disciplines от топ List ми дава грешка?
	private final String name;
	private ArrayList<Enum<Discipline>> disciplines = new ArrayList<Enum<Discipline>>();

	public Teacher(String name, Enum... disciplines)
	{
		this.name = name;
		for (Enum e: disciplines)
		{
			this.disciplines.add(e);
		}

	}

	public String getName()
	{
		return name;
	}

	public ArrayList<Enum<Discipline>> getDisiplines()
	{
		return disciplines;
	}

	public boolean isHired(String name)
	{
		if (this.name == name)
			return true;
		return false;
	}
}
