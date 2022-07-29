package patterns;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
				
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i<= n ; i++)
		{
			for(int j = 0 ; j<= n ; j++)
			{
				//  i+j == i	i+j == j	
				//if(j<n && j>0 && i<n && i>0)
				if(j == 0 || i == 0  || i == n || j == n || (i+j) <= n/2 || (j-i) >= n/2)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.println(" ");
		}
		
		sc.close();
	}

}
