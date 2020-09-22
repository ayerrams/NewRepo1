package test;

class Q38
{
	public static void main(String[] args) 
	{
		char c1 = 'A';
		for(int i = 1; i <= 5; i++, c1 += 2)
		{
			for(int j = 1; j <= (5 - i); j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= ((2*i) - 1); j++)
			{
				System.out.print(c1);
			}
			System.out.println();
		}
	}
}
