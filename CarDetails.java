import java.util.Scanner;

public class CarDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car name:");
		String carName = sc.nextLine();
		System.out.println("Enter the car number:");
		String carNo = sc.nextLine();
		System.out.println("Enter the price of car:");
		double carPrice = sc.nextDouble();
System.out.println("Enter the price:");
		System.out.println("Added to it");	
		System.out.println("Car name:"+carName);
		System.out.println("Car no:"+carNo);
		System.out.println("Price:"+String.format("%.2f", carPrice)+" Rs only");

	}

}
