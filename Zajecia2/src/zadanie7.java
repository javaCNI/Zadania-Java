import java.util.Scanner;

// TEMAT 2

/*
	7. Napisaæ program dzia³aj¹cy w trybie konsolowym (tekstowym) i rysuj¹cy na ekranie prostok¹t.
	U¿ytkownik podaje:
	- znak wype³nienia prostok¹ta,
	- pozycjê lewego górnego rogu prostok¹ta (x, y) oraz
	- d³ugoœci boków prostok¹ta (ab).
	
	Przyjmujemy, ¿e lewy górny naro¿nik konsoli ma wspó³rzêdne (x, y) = (1, 1).
	
	Przyk³ad: x=6, y=3, a=4, b=6, zn=’x’
	>
	>
	> _____xxxxxx
	> _____xxxxxx
	> _____xxxxxx
	> _____xxxxxx
	
	ozn.
	> - nowa linia,
	_ - znak spacji.
 */

/*
public class zadanie7
{
	public static void main(String[] args)
	{
		int x = 1, y = 1, a = 0, b = 0;
		char zn= ' ';
		String tempS = " ";
		Scanner in = new Scanner(System.in);
		
		System.out.print("Podaj znak wype³nienia prostok¹ta: ");
		tempS = in.next();
		zn = tempS.charAt(0);
		
		System.out.println("Wczytaj pozycje lewego górnego rogu prostok¹ta (x , y) - domyœlnie (1 , 1).");
		System.out.print("Podaj x: ");
		x = in.nextInt();
		System.out.print("Podaj y: ");
		y = in.nextInt();
		
		System.out.println("Wczytaj d³ugoœci boków prostok¹ta ab");
		System.out.print("Podaj a: ");
		a = in.nextInt();
		System.out.print("Podaj b: ");
		b = in.nextInt();
		
		// Tworzy tablice o wymiarach bokow prostok¹ta ab + przerwy z x i a,  i wype³nia j¹ wybranym znakiem.
		char[][] tab = new char[a+y][b+x];
		
		for(int i=0; i<=y; i++)
		{
			for(int j=0; j<=x; j++)
			{
				tab[i][j] = ' ';
			}
		}
		
		for(int i=y; i<(a+y); i++)
		{
			for(int j=x; j<(b+x); j++)
			{
				tab[i][j] = zn;
			}
		}
		
		// wypisuje prostok¹t
		for(int i=0; i<(a+y); i++)
		{
			for(int j=0; j<(b+x); j++)
			{
				System.out.print(tab[i][j]);
			}
			System.out.print('\n');
		}
	}
}

*/

// *TIP:	w java nie ma polecenia gotoXY jak w c++ :P wiec trzeba sie wiecej pobawic aby wyswietlic tekst w wybranym miejscu
//				wszystko dlatego ze java i c# widza konsole inaczej niz c++, dla c++ konsola to po prostu ekran.