package demo2.service;

import java.util.HashMap;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public class UserEventHandler implements UserService {
	
	HashMap<String, String> userInfo = new HashMap<String, String>();
	
    public void createUser() {
    	userInfo.put("anna@gmail.com", "12345678");
    	userInfo.put("Peter@gmail.com", "12345678");
    	userInfo.put("John@gmail.com", "12345678");
    	userInfo.put("May@gmail.com", "12345678");
    	userInfo.put("Leo@gmail.com", "12345678");
    	userInfo.put("Mary@mail.com", "12345678");
    }

	@Override
	public String login(String username, String password) {
		if(password.equals(userInfo.get(username.toLowerCase()))) {
			return "Login Sucess";
		}

		return "Incorrect Username or password";
	}

}
