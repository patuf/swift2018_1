package domashno08.HWK;

public class Discipline implements IName {

	private final String name;
	private final int hourPerWeek;
	
	

	public Discipline(String name, int hourPerWeek) {
	
		this.name = name;
		this.hourPerWeek = hourPerWeek;
	}



	@Override
	public String getName() {

		return name;
	}

}
