package entities;

public class Human {
	private String gender;
	private int age;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Human(String gender, int age) {
		super();
		this.gender = gender;
		this.age = age;
	}
	public Human() {
		super();
	}
	
}
