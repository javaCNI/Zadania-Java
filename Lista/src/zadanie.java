
/*
	Napisa� klas� Lista , kt�rej zadaniem b�dzie przechowywanie listy liczb ca�kowitych.
 */

public class zadanie
{
	public static void main(String[] args)
	{
		final int N = 10;
		Lista l = new Lista(N);
		for (int i = 0; i < N/2; ++i)
		{
			l.dodajElement( (1 << i) );
		}
		l.dodajElement(2);
		l.dodajElement(8);
		l.pisz();
		l.usunPierwszy(2);
		l.pisz();
		for (int i = 0; i < N/2; ++i)
		{
			l.dodajElement( (1 << i) );
		}
		l.pisz();
		System.out.println("Po usuni�ciu powt�rze�:");
		l.usunPowtorzenia();
		l.pisz();		
	}

}

/*
Przyk�adowo, po wykonaniu poni�szego fragmentu:
final int N = 10;
Lista l = new Lista(N);
for (int i = 0; i < N/2; ++i) {
l.dodajElement( (1 << i) );
}
l.dodajElement(2);
l.dodajElement(8);
l.pisz();
l.usunPierwszy(2);
l.pisz();
for (int i = 0; i < N/2; ++i) {
l.dodajElement( (1 << i) );
}
l.pisz();
System.out.println("Po usuni�ciu powt�rze�:");
l.usunPowtorzenia();
l.pisz();

Na ekranie powinno zosta� wy�wietlone:
Lista:
Pojemno��: 10
Rozmiar: 7
Elementy: 1 2 4 8 16 2 8
Lista:
Pojemno��: 10
Rozmiar: 6
Elementy: 1 4 8 16 2 8
Nie mo�na doda� wi�cej element�w, lista pe�na!
Lista:
Pojemno��: 10
Rozmiar: 10
Elementy: 1 4 8 16 2 8 1 2 4 8
Po usuni�ciu powt�rze�:
Lista:
Pojemno��: 10
Rozmiar: 5
Elementy: 1 4 8 16 2
*/