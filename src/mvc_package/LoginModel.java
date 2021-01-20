package mvc_package;



public class LoginModel {

	private String username, password;
	
	
	
	public String check() {
		
		String user1 = "user1";
		String user2 = "user2";
		String incorrect = "incorrect"; 
		
		if(username.equals("johnny") && password.equals("silverhand")) {
			
			
			
			return user1;
		}
		else if (username.equals("Heithem") && password.equals("developer")) {
			return user2;
		}
		else {
			return incorrect;
		}
		
	
	}
	
	
	
	
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
