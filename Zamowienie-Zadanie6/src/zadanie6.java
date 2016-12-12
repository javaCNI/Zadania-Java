import java.io.IOException;

/*
	6. W obu klasach zaimplementowaæ interfejs Serializable umo¿liwiaj¹cy zapis i odczyt danych z pliku realizowany przez metody:
		• metodê public static void zapiszZamowienie(Zamowienie z, String nazwaPliku), 
			która zapisze podane w parametrze zamówienie do pliku o nazwie podanej drugim parametrem.
		• metodê public static Zamowienie (*ja zamienilem na String, bo za duzo zmian) wczytajZamowienie(String nazwaPliku), 
			która wczyta z pliku o podanej nazwie zamówienie i zwróci je jako wynik.	
 */

public class zadanie6
{
	public static void main(String[] args) throws IOException
	{
		Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
		//System.out.println(p1);
		Pozycja p2 = new Pozycja("Cukier", 3, 4);
		//System.out.println(p2);
		Pozycja p3 = new Pozycja("Jajka", 10, 0.5);
		//System.out.println(p3);
		Pozycja p4 = new Pozycja("M¹ka", 2, 3);
		//System.out.println(p4);
		Pozycja p5 = new Pozycja("Dro¿d¿e", 2, 1.5);
		//System.out.println(p5);
		Pozycja p6 = new Pozycja("Sok jab³kowy", 1, 5);
		//System.out.println(p6);
		Pozycja p7 = new Pozycja("Marchew", 4, 0.8);
		//System.out.println(p7);
		Pozycja p8 = new Pozycja("Jab³ka", 5, 0.8);
		//System.out.println(p8);
		Pozycja p9 = new Pozycja("Kakao", 1, 3.5);
		//System.out.println(p9);
		Pozycja p10 = new Pozycja("Wanilia", 2, 1);
		//System.out.println(p10);
		Zamowienie z = new Zamowienie(10);
		z.dodajPozycje(p1);
		z.dodajPozycje(p2);
		z.dodajPozycje(p3);
		z.dodajPozycje(p4);
		z.dodajPozycje(p5);
		z.dodajPozycje(p6);
		z.dodajPozycje(p7);
		z.dodajPozycje(p8);
		z.dodajPozycje(p9);
		z.dodajPozycje(p10);
		
		z.dodajPozycje(p10);	// dodaje drugi raz to samo
		
		System.out.println(z);
		
		z.usunPozycje(4);
		System.out.println(z);
		
		//z.edytujPozycje(6);
		System.out.println(z);
		
		Zamowienie.zapiszZamowienie(z, "Zamowienie");
		z.wczytajZamowienie("Zamowienie");
	}
}