package domashno08.HWK;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
	
	private List<Discipline>subjectList=new ArrayList<Discipline>();

	public Teacher(String name) {
		super(name);
		
	}

}
