package patternNumbers;

import java.util.Scanner;

public class number_pattern_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		int k;
		
		System.out.println("Enter the Pattern Size : ");
		n = sc.nextInt();
		
		System.out.println("Number Pattern : \n");
		
		for(int i = 1;i <= n;i ++) 
		{
			k = n;
			for(int j = 1;j <= n;j ++) 
			{
				System.out.print(k-- +" ");
			}
			System.out.println();
		}
	}
}


/*
================
	OUTPUT
================
	
	Enter the Pattern Size : 
	5
	Number Pattern : 
	
	5 4 3 2 1 
	5 4 3 2 1 
	5 4 3 2 1 
	5 4 3 2 1 
	5 4 3 2 1 
	
 */