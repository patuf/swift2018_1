package domashno08.HWK;

import java.util.ArrayList;
import java.util.List;

public class Class implements IName {
	private final String name;

	public Class(String name) {
		super();
		this.name = name;
	}

	List<Student> studentList = new ArrayList<Student>();
	List<Teacher> teacherList = new ArrayList<Teacher>();

	@Override
	public String getName() {

		return name;
	}

}
