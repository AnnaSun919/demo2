package demo2;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;


public class SimpleStartup {
	
	
	int[] locations;
	int guess;
	int numberOfHit = 0; 
	
	public int getGuess() {
		return guess;
	}

	public void setGuess(int guess) {
		this.guess = guess;
	}

	public int[] getLocations() {
		return locations;
	}

	public void setLocations(int[] locations) {
		this.locations = locations;
	}
	
	String checkyourself(int guess){
		
		if(ArrayUtils.contains(this.locations, guess)) return "Hit!";
		
		return "Missed!";
	}
	
	void gameStart() {
		int round = this.getLocations().length;
		GameHelper gh = new GameHelper();
		String prompt = "Enter a number";
		

	}
	

}
