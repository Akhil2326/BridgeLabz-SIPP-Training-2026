import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
	
	        Scanner sc = new Scanner(System.in);
			 System.out.print("Enter Name: ");
			String name = sc.nextLine();
									
			 System.out.print("Enter Age: ");
			int age = sc.nextInt();	
													
			 System.out.print("Enter Rank: ");
			char rank = sc.next().charAt(0);
																	
			 System.out.print("Enter Salary: ");
			double salary = sc.nextDouble();
																					
			 System.out.print("Enter Membership Fee: ");
			 float membershipFee = sc.nextFloat();
																									
																									        
			 int bonus = (int)(salary * 0.12);
			 System.out.println("Name: " + name);
			 System.out.println("Age: " + age);
			 System.out.println("Rank: " + rank);
			 System.out.println("Salary: " + salary);
			 System.out.println("Membership Fee: " + membershipFee);
		     System.out.println("Annual Bonus: " + bonus);
	}
}