package buy_and_sell_stock;

import java.util.Scanner;

/*
	Say you have an array, A, for which the ith element is the price of a given stock on day i.
	
	If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
	
	Return the maximum possible profit.
	
	
	Input 1:
	
	A = [1, 2]
	
	Input 2:
	
	A = [1, 4, 5, 2, 4]
	

	Output 1:
	
	1
	
	Output 2:
	
	4
 */
public class Buy_and_sell_Stock {
	
	private static void buy_and_sell_stock(int[] array) {
		
		  int max_profit=0;
		int min=array[0];
			for(int i=1;i<array.length;i++)
			{
				if(array[i]<min)
				{
					min=array[i];
				}
				max_profit=Math.max(max_profit, array[i]-min);
			}
		
		System.out.println(max_profit);
	}


	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();		
		}
		buy_and_sell_stock(array);

	}

	
}
