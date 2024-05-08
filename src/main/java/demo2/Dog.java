package demo2;

public class Dog {
	
//	The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
//
//		declare class variables/attributes as private
//		provide public get and set methods to access and update the value of a private variable
	
	
	//instance variable public one can use dot operator , private one use getter and setter 
	private int size;
	private String breed;
	private String name;
	
	//getter and setter 
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//method
	void bark() {
		System.out.println("testing Ruff");
	}
	
	

}
