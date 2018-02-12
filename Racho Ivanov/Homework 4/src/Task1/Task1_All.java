package Task1;

import Common.Scan;

public class Task1_All
{
	public static void main(String[] args)
	{
		int size = Scan.scanInt();
		int[][] matrix = new int[size][size];
		int counter = 1;

		//Task1a_printMatrix
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				matrix[j][i] = counter;
				counter++;
			}
		}

		print2dMatrix(matrix);

		counter = 1;

		//Task1b_printMatrix
		boolean fromTopToBottom = true;

		for (int i = 0; i < size; i++)
		{
			if (fromTopToBottom)
			{
				for (int j = 0; j < size; j++)
				{
					matrix[j][i] = counter;
					counter++;
				}
				fromTopToBottom = false;
			}
			else
			{
				for (int j = size - 1; j >= 0; j--)
				{
					matrix[j][i] = counter;
					counter++;
				}
				fromTopToBottom = true;
			}
		}
		counter = 1;
		print2dMatrix(matrix);

		//Task1c_PrintMatrix
		boolean fromLeftToRight = true;
		int rowCounter = 1;
		boolean flagRowCounter = true;
		int[] tempArr = new int[size*2];
		while(rowCounter > 0)
		{


			for (int i = 0; i < rowCounter; i++)
			{

			}

				if(rowCounter < size)
					flagRowCounter = true;
				else
					flagRowCounter = false;

				if(flagRowCounter)
					rowCounter++;
				else
					rowCounter--;
		}



		print2dMatrix(matrix);
		counter = 1;

	}
	static void print2dMatrix(int matrix[][])
	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				if (matrix[i][j] < 10)
				System.out.print(matrix[i][j] + "  ");
				else
					System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
}
