import java.util.Scanner;

// TEMAT 2

/*
	8. Napisa� program rysuj�cy w konsoli �choink� z�o�on� ze znak�w gwiazdki (*).
	U�ytkownik programu powinien poda� liczb� ca�kowit� n > 0, okre�laj�c� wysoko�� choinki (liczb� wierszy).
	
	Przyk�ad: dla n = 5 wynik powinien wygl�da� nast�puj�co:
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
		
		System.out.print("Podaj wysoko�� 'choinki': ");
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

// *TIP:	- Je�eli wysoko�� choinki wynosi n, to jej szeroko�� wynosi (2*n)-1