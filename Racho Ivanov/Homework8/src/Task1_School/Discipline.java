package Task1_School;

public enum Discipline
{
	MATH("math", 5),
	PHYSICS("physics", 7),
	GEOLOGY("geology",12),
	HISTORY("history",14),
	CHEMISTRY("chemistry",3);

	private final String desc;
	private  int coric;

	Discipline(String description, int coriculum)
	{
		this.desc = description;
		this.coric = coriculum;
	}

	public String getDesc()
	{
		return desc;
	}

	public int getCoric()
	{
		return coric;
	}

	public void setCoric(int coric)
	{
		this.coric = coric;
	}
}
