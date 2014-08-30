package main;

public class SpiralMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = new int[4][4];
		
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				matrix[i][j] = 4*i + j;
				System.out.println("matrix"+i+"_"+j+"="+matrix[i][j]);
			}
		}
		
		/*
		 * 0 1 2 3
		 * 4 5 6 7
		 * 8 9 10 11
		 * 12 13 14 15
		 * 
		 * 
		 */
		
		
		// we want to spiral from a starting index and grow outwards
		int x = 1;
		int y = 1;
		int dist = 1;
		int posNeg = 1;
		
		while(matrix[x][y] >= 0)
		{
			for(int tdist=dist; tdist > 0; tdist--)
			{
				y+= posNeg;
				System.out.println(matrix[x][y]);
			}
			for(int tdist = dist; tdist > 0; tdist--)
			{
				x+= posNeg;
				System.out.println(matrix[x][y]);
			}
			dist++;
			posNeg *= -1;
			
		}
			
	}

}
