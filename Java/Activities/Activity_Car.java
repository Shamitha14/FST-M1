package activities;

public class Car {
	String color;
	String trasmission;
	int make;
	int tyres;
	int doors;
	Car(){
		tyres=4; 
		doors=4;
		
	}

	public void displaycharacterstics(){
		System.out.println(color+trasmission+make+tyres+doors);
		
	}
	public void accelerate() {
		System.out.println("car is moving");
	}
	
	public void brake(){
		System.out.println("car has stopped");
		
	}
	
	
	
}
