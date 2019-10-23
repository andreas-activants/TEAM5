
public class Login {
	String username;
	String password;
	
	public Login(String username, String password) {
		//this is constructor
		this.username = username;
		this.password = password;
	}
	
	public boolean validateLogin() {
		if (this.username == "" || this.password == "") {
			return false;
		}
		return true;
	}
	
}
