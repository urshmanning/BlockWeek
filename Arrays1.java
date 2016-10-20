package dataStructures;

public class Arrays1 
{
	int [] Array = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
	int [][] multi = new int[][]{
		{13, 9, 4, 13, 10, 8, 23, 13, 2, 546},
		{18, 13, 13, 2, 24, 6, 16, 11, 12, 123},
		{35, 30, 17, 23, 26, 0, 45, 121, 122, 124},
		{50, 10, 62, 16, 0, 1, 125, 3, 124, 7}
	};
	int [][][] multi2 = new int[3][4][5];
	
	public void displayArray()
	{
		for (int element:Array) //foreach loop
		{
			System.out.println(element);
		}
	}
	
	public void displayMulti()
	{
		for(int i = 0; i<4; i++)
		{
			for(int j = 0; j<10; j++)
			{
				System.out.println(multi[i][j]);
			}
		}
	}
	
	public void full3D()
	{
		for(int i=0; i<3; i++)
		{
			for(int j = 0; j<4; j++)
			{
				for(int k=0; k<5; k++)
				{
					multi2[i][j][k] = i*j*k;
				}
			}
		}
	}
	
	public void display3D()
	{
		for(int i=0; i<3; i++)
		{
			for(int j = 0; j<4; j++)
			{
				for(int k=0; k<5; k++)
				{
					System.out.println(multi2[i][j][k]);
				}
			}
		}
	}
	
	public void displayEach3D()
	{
		for(int[][] i:multi2)
		{
			for(int [] j:i)
			{
				for(int k:j)
				{
					System.out.println(k);
			
				}
			}
		}
	}
}
