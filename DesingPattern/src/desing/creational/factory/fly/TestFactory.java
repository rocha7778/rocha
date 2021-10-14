package desing.creational.factory.fly;

import java.util.Scanner;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Please select your favorite fly");
		System.out.println("1: Banshee");
		System.out.println("2: B747Fly");
		System.out.println("3: A380Fly");
		
		int code = in.nextInt();
		
		Fly fly = FlyFactory.creator(code);
		
		fly.shoot();
		

	}

}
