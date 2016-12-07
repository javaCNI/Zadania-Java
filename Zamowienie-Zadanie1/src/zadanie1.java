
/*
	1. Napisa� program do obs�ugi zam�wie�. Program powinien sk�ada� si� z dw�ch klas:
			Zamowienie oraz Pozycja,
	   przy czym ka�de zam�wienie zawiera� mo�e jedn� lub wi�cej pozycji.
	   
	   TIP* Wiecej info o zadaniu na dole kazdego pliku klasy!
 */

public class zadanie1
{
	public static void main(String[] args)
	{
		Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
		System.out.println(p1);
		Pozycja p2 = new Pozycja("Cukier", 3, 4);
		System.out.println(p2);
		
		Zamowienie z = new Zamowienie(20);
		z.dodajPozycje(p1);
		z.dodajPozycje(p2);
		//System.out.println(z.pozycje[0]);
		System.out.println(z);
		z.obliczWartosc();
	}
}

/*
Przyk�adowa metoda korzystaj�ca z wspomnianych klas:

	public static void main(String [] args) throws IOException
	{
		Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
		System.out.println(p1);
		Pozycja p2 = new Pozycja("Cukier", 3, 4);
		System.out.print(p2);
		Zamowienie z = new Zamowienie(20);
		z.dodajPozycje(p1);
		z.dodajPozycje(p2);
		System.out.println(z);
	}

Przyk�adowy wynik:

	Chleb 		3,50 z� 		1 szt. 		3,50 z�
	Cukier 		4,00 z� 		3 szt. 		12,00 z�
	
	Zam�wienie:
	Chleb 		3,50 z� 		1 szt. 		3,50 z�
	Cukier 		4,00 z� 		3 szt. 		12,00 z�
	
	Razem: 15,50 z�
*/