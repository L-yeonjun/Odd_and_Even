package Odd_and_Even;
import java.util.*;

public class Odd_and_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int com, user;
		int price;

		System.out.println("========== Ȧ¦ Game ==========");
		System.out.println("Start Money : ");
		price = sc.nextInt();
		
		while(true) {
			com = (int)(Math.random()*100);
			com = com % 2;
			
			System.out.println("------------------------------");
			System.out.printf("\t\t price : %d\n", price);
			System.out.println("------------------------------");
			System.out.println("Ȧ¦(1, 0) : ");
			user = sc.nextInt();
			
			if(user >= 2) {
				System.out.println("------------------------------");
				System.out.println("========= Game Exit =========");
				break;
			}
			
			System.out.printf("Com : %d VS User : %d\n",com, user);
	
			if(com == user) {
				System.out.println("You Win!!!");
				price = price + 100;
			}
			else {
				System.out.println("You lose...");
				price = price - 100;
			}
			if (price == 0) {
				System.out.println("========= Game Over =========");
				break;
			}
		
		}
		
	}
}