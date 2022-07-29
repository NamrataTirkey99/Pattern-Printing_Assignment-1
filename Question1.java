package patterns;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i< 4 ; i++)
		{
			for(int j = 0 ; j<= 26 ; j++)
			{
				if(i == 0 && ( j == 0 || j == 2 || j == 5 ||  j == 7 || j == 8 || j == 9 || j == 11 ||  j == 13 || j == 15 || j == 16 || j == 17 ||  j == 20 || j == 23 || j == 26) )
				{
					System.out.print("*");
				}
				else if(i == 1 && ( j == 0 || j == 2 || j == 5  || j == 7 || j == 8 || j == 3   || j == 11 || j == 13 || j == 17 || j == 15 || j == 19 || j == 21 || j == 23|| j == 24 || j == 26))
				{
					System.out.print("*");
				}
				else if(i == 2 && ( j == 0 || j == 2 || j == 5  || j == 4 || j == 7 || j == 11  || j == 13 || j == 15 || j == 16  || j == 21 || j == 19|| j == 23 || j == 25 || j == 26))
				{
					System.out.print("*");
				}
				else if(i == 3 && ( j == 0 || j == 2 || j == 5 || j == 7 || j == 8 || j == 9 || j == 11 || j == 12 || j == 13 || j == 15 || j == 17 || j == 20 ||  j == 23 ||  j == 26))
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

	}

}
