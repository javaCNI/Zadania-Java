
/*
	1. Napisaæ program do obs³ugi zamówieñ. Program powinien sk³adaæ siê z dwóch klas:
			Zamowienie oraz Pozycja,
	   przy czym ka¿de zamówienie zawieraæ mo¿e jedn¹ lub wiêcej pozycji.
	   
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
Przyk³adowa metoda korzystaj¹ca z wspomnianych klas:

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

Przyk³adowy wynik:

	Chleb 		3,50 z³ 		1 szt. 		3,50 z³
	Cukier 		4,00 z³ 		3 szt. 		12,00 z³
	
	Zamówienie:
	Chleb 		3,50 z³ 		1 szt. 		3,50 z³
	Cukier 		4,00 z³ 		3 szt. 		12,00 z³
	
	Razem: 15,50 z³
*/