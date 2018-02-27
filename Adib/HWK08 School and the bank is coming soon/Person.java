package domashno08.HWK;

public class Person implements IName {
	private final String name;
	public Person(String name) {
		
		this.name = name;
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	

}
