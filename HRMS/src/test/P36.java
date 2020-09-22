package test;

class P36

 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int rows = 7;
		int cols = 7;
		for(int rowCount =1; rowCount <= rows; rowCount++)
		{
			for(int colCount =rows; colCount >= (rows +1 - rowCount); colCount --)
				
			{
				System.out.println(colCount);
			}
			System.out.println();
		}
		
		
	}

}
