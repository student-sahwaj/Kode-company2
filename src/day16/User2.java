package day16;
import java.util.*;
public class User2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int price1 = 0;
		System.out.println("Enter the price...");
		if (sc.hasNextInt()) {	
		 price1 = sc .nextInt();
		 System.out.println("price: " + price1);
		} else {
			System.out.println("Enter the valid number.....");
		}
		

	}

}
