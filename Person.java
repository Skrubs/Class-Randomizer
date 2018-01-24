package application;

public class Person {
	
	private String name;
	private String rank;
	
	public Person(String rank, String name) {
		this.rank = rank;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return rank + " " + name;
	}

}
