package People;

import java.util.*;

public class People {

	private String name, jobTitle;
	private int age;

	public People(String name, String jobTitle, int age){

		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public String getJobTitle(){
		return jobTitle;
	}

	public int getAge(){
		return age;
	}

	public String toString(){

		String s = "Name: " + getName() + " " + "Job Title: " + getJobTitle() + " " + "Age: " + getAge();

		return s;
	}
	
	public static void main(String[] args){

		People person1 = new People("John Clark", "Developer", 35);
		People person2 = new People("Ash Jackson", "DevOps", 38);
		People person3 = new People("Stuart Johnson", "Network Engineer", 34);

		
		ArrayList<People> persons = new ArrayList<People>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		
		for(People p: persons){
			System.out.println(p.toString());
		}
	}
}
