package staticJava;

public class Employee {
	String firstName="Hasan";
	String lastName="Z";
	int age=20;
	boolean usCitizen=true;
	static String mentor="Mafi";
	
	public static void showMe() {
		System.out.println(firstName + " " +lastName + " " + age + " " + usCitizen + " "+ mentor + " ");
}
	public static void main(String[] args) {
		Employee donaldTrump = new Employee();
		donaldTrump.firstName = "Donald";
		donaldTrump.lastName ="Trump";
		donaldTrump.age = 100; 
		donaldTrump.usCitizen = true;
		donaldTrump.mentor = "Melania";
		
		
		Employee mac = new Employee();
		mac.firstName = "Donald";
		mac.lastName ="Trump";
		mac.age = 100; 
		mac.usCitizen = true;
		mac.mentor = "Melania";
		mac.mentor = "Mia";
		mac.mentor = "Hasan";
		
		
		donaldTrump.showMe();
		mac.showMe();
}		
	}		
		
	
		
	
