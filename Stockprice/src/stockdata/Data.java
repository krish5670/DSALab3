package stockdata;
import java.util.Scanner;

import stockdata.SearchandSort;


public class Data {
	Scanner sc = new Scanner(System.in);
	SearchandSort search = new SearchandSort();
	Sort stkSort = new Sort();
	boolean aryInAscending = false;
	Share[] shares;
	Share share;
	
	public void searchPrice() {
		System.out.println("\nEnter the value");
		double price = sc.nextDouble();
		if (aryInAscending == false) {
			stkSort.ascending(shares);
		}
		int tmp = search.SearchandSort(shares, price);
		if (tmp == -1) {
			System.out.println("Value not found");
		}
		else {
			System.out.println("Stock of value " + shares[tmp].price + " is present ");
		}
	}
	
	public void priceIncreases() {
		int reslt = 0;
		for (Share stk: shares) {
			if (stk.upTrend == true) {
				reslt++;
			}
		}
		System.out.println("\nTotal no of companies whose stock price rose today : " + reslt);	
	}
	
	public void priceDecreases() {
		int reslt = 0;
		for (Share stk: shares) {
			if (stk.upTrend == false) {
				reslt ++;
			}
		}
		System.out.println("\nTotal no of companies whose stock price declined today : " + reslt);
	}

	public void dispDescendingOrder() {
		stkSort.descending(shares);
		System.out.println("\nStock prices in descending order are :");
		display();
		aryInAscending = false;
	}


	public void dispAscendingOrder() {
		stkSort.ascending(shares);
		System.out.println("\nStock prices in ascending order are :");
		display();
		aryInAscending = true;
	}
	

	public void display() {
		for (Share stk: shares) {
			System.out.print(stk.price + " ");
		}
		System.out.println();
	}

	
	public void populate(int companies) {
	
		shares = new Share[companies];
		double price;
		boolean upTrend;
		
		for(int i = 1; i <= companies; i++) {
			System.out.println("Enter current stock price of the company " + i);
			price = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			upTrend = sc.nextBoolean();
			share = new Share(price, upTrend);
			shares[i-1] = share;
		
	}
		
	}
}
