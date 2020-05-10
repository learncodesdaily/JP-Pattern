package patternStars;

public class star_pattern_05 {
	public static void main(String[] args) {
		
		int n = 5;
		
		System.out.println("5x5 star patter : \n");
		
		for(int i = 1;i <= n;i ++) 
		{
			for(int j = 1;j <= n;j ++) 
			{
				if(i == 1 || i == n || j == 1 || j == n )
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}


/*
================
	OUTPUT
================
 
	5x5 star patter : 

	 *  *  *  *  * 
	 *           * 
	 *           * 
	 *           * 
	 *  *  *  *  *      

*/