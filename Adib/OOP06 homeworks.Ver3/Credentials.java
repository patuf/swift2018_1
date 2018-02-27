package trainging.oldtasks;

public class Credentials {
	private final String name;
	private String password;

	String[] oldPass = new String[100];
	int count = oldPass.length;
	

	public Credentials(String name, String password) {
		this.name = name;
		if (name.equals(null) && name.isEmpty()) {
			return;
		}
		this.password = password;
		
		addPassword(password);
	
	}

	boolean checkPass(String password) {

		if (password.equals(this.password)) {
			return true;
		} else if (password.equals(oldPass[oldPass.length - count--])) {
			return false;
		}
		return false;
	}

	boolean changePass(String newPassword) {
		for (int i = 0; i < oldPass.length; i++) {
			if (newPassword.equals(oldPass[i])) {
				System.err.println("CHPASS fail");
				System.err.println("the password was Used before");
				return false;
			}
		}
		if (!this.password.equals(newPassword)) {
			this.password = newPassword;
			addPassword(newPassword);
			System.out.println("CHPASS Sucess");
			return true;
		} 
		
		return false;

	}

	public String getPassword() {
		return password;
	}

	
	public String getName() {
		return name;
	}

	void addPassword(String password) {

		oldPass[oldPass.length - count--] =password ;

	}

	public void setPassword(String password) {
		this.password = password;
	}

}
