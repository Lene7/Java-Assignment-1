//Lene Kriel
//34317996
//Assignment 1 Part 2

public class Question2 {
	private String message;
	
	public Question2(String message){
		this.message = message;
	}
	
	//function to print stored message
	public void printMessage() {
		System.out.println(message);
	}
	public static void main(String[] args) {
		//two instances of Question2
		Question2 instance1 = new Question2("Hello Prof, this is instance 1!");
		Question2 instance2 = new Question2("And now you are at my 2nd instance!");
		
		//call toString method
		System.out.println("Instance 1 message: " + instance1.toString());
		System.out.println("Instance 2 message: " + instance2.toString());
	}
	
	@Override
	public String toString() {
		return message;
	}
	
}