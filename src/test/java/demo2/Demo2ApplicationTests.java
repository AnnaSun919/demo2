package demo2;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;



import demo2.Demo2Application;
import demo2.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Demo2Application.class)
@WebAppConfiguration
@EnableConfigurationProperties
class Demo2ApplicationTests {
	

	
	@Autowired private UserService userService;
	
	@Test
	void contextLoads() {
		
		userService.createUser();
		 
		String response = userService.login("Anna@gmail.com", "12345678");
		System.out.println(response); 
		response = userService.login("amy@gmail.com", "12345678"); 
		System.out.println(response); 
		response = userService.login("amy@gmail.com", "35897888"); 
		System.out.println(response); 
//		this.testFunction();
		
		
	}
	
//	set array of number , example {2,3,4}
//	user has 2 times of chance to guess 
//	void testFunction() {
//		SimpleStartup test = new SimpleStartup();
//		GameHelper gh = new GameHelper();
//		String prompt = "Enter a Number";
//		
//		
//		int[] location = {2,3,4};
//		test.setLocations(location);
//		
//		int userGuess = gh.getNumber(prompt);
//		String result = test.checkyourself(userGuess);
//		
//		String testResult = "failed";
//		if(result.equals("Hit!")){
//			testResult = "Passed";
//		}
//		
//		userGuess = gh.getNumber(prompt);
//		
//		testResult = "failed";
//		result = test.checkyourself(userGuess);
//		if(result.equals("Missed!")){
//			testResult = "Passed";
//		}
//		
//		System.out.println("Testing completed , test result : " + testResult);
//				
//	
//	}

}
