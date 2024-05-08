package demo2;

import java.util.Scanner;

public class GameHelper {
	
	@SuppressWarnings("resource")
	int getNumber(String prompt) {
		System.out.println(prompt + ":");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}


}
