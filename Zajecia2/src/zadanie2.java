import java.util.Scanner;

// TEMAT 2

/*
	2. Napisa� program pobieraj�cy od u�ytkownika dwie liczby ca�kowite A oraz B,
	A < B, a nast�pnie wyznaczaj�cy sum� ci�gu liczb od A do B, czyli sum� ci�gu
	(A, A + 1, . . . , B).
	Obliczenia nale�y wykona� trzykrotnie stosuj�c kolejno p�tle: while, do-while, for.
	Przyk�ad:
		Dla A = 4 i B = 11 program powinien wy�wietli�:
			60
			60
			60

 */

/*
public class zadanie2
{
	public static void main(String[] args)
	{
		int A = 0, B = 0, suma = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Wpisz liczbe A: ");
		A = in.nextInt();
		System.out.print("Wpisz liczbe B: ");
		B = in.nextInt();

// P�tla WHILE
		int i = (A<B ? A : B);
		while(i <= (A>B ? A : B))
		{
			suma+=i;
			i++;
		}
		System.out.println("WHILE suma = " + suma);
		
// P�tla DO WHILE
		suma = 0;
		int j = (A<B ? A : B);
		do
		{
			suma+=j;
			j++;
		}while(j <= (A>B ? A : B));
		System.out.println("DO WHILE suma = " + suma);
		
// P�tla FOR
		suma = 0;
		for(int k = (A<B ? A : B); k<=(A>B ? A : B); k++ )
			suma+=k;
		System.out.println("FOR suma = " + suma);
	}
}
*/