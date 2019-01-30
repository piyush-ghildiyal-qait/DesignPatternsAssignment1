package factorydesign2;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		String comp;
		
		int con=1;
		
		
		System.out.println("You can only Create Two types of Computer\n");
		System.out.println("1.PC");
		System.out.println("2.Server");
		
		
		do {
			try {
		System.out.println("\nEnter the type of computer which you want to be created");
		comp=sc.next();
		ComputerFactory computerFactory=ComputerFactory.getInstance();
		computerFactory.create(comp).createComputer();
			}
			catch (NullPointerException e) {
				System.out.println("Enter a valid type of Computer");
			}
			finally {
				System.out.println("\nEnter 1 to continue");
				con=sc.nextInt();
			}
			
		}while(con==1);
		
		sc.close();
		
		
	}
	
	
}
