package ca.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		displayGreeting();
		data.display();
	}

	private static void displayGreeting() {
		System.out.println("Hello happy sales people!");
		System.out.println("This app shows  data");
		System.out.println("---------------------");
		
		System.out.println("Test1");
		System.out.println("Test2");
		System.out.println("Test3");
		System.out.println("Test4");
		System.out.println("Test5");
	}

}
