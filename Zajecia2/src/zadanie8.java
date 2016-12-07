import java.util.Scanner;

// TEMAT 2

/*
	8. Napisaæ program rysuj¹cy w konsoli „choinkê” z³o¿on¹ ze znaków gwiazdki (*).
	U¿ytkownik programu powinien podaæ liczbê ca³kowit¹ n > 0, okreœlaj¹c¹ wysokoœæ choinki (liczbê wierszy).
	
	Przyk³ad: dla n = 5 wynik powinien wygl¹daæ nastêpuj¹co:
			*
		   ***
		  *****
		 *******
		*********
 */

/*
public class zadanie8
{
	public static void main(String[] args)
	{
		int n = 0, Lewo = 0, Prawo = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Podaj wysokoœæ 'choinki': ");
		n = in.nextInt();
		Lewo = n-1;
		Prawo = n-1;
		char[][] tab = new char[n][(2*n)-1];
		
		for(int i=0; i<n; i++)
		{
			for(int j=Lewo; j<=Prawo; j++)
			{
				tab[i][j] = '*';
			}
			Lewo--;
			Prawo++;
		}
		
		// Wypisanie
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<((2*n)-1); j++)
			{
				System.out.print(tab[i][j]);
			}
			System.out.print('\n');
		}
		
		
	}

}
*/

// *TIP:	- Je¿eli wysokoœæ choinki wynosi n, to jej szerokoœæ wynosi (2*n)-1