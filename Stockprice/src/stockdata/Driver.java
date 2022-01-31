package stockdata;
import java.util.Scanner;

import stockdata.Share_data;
import stockdata.Data;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Data stocks = new Data();
		int choice = 0;
		
		
		System.out.println("Enter the no of companies");
		int companies = sc.nextInt();
		stocks.populate(companies);
	
	
		do {
			System.out.println("\n-----------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				stocks.dispAscendingOrder();
				break;
			case 2:
				stocks.dispDescendingOrder();
				break;
			case 3:
				stocks.priceIncreases();
				break;
			case 4:
				stocks.priceDecreases();
				break;
			case 5:
				stocks.searchPrice();
				break;
			case 0:
				System.out.println("Exited successfully");
				break;
			default:
				System.out.println("Please enter a valid choice!");
			}
		}while(choice != 0);
		
		sc.close();
	}

	}

