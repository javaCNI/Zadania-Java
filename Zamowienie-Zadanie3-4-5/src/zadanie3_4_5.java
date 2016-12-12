
/*
	3. W klasie Pozycja :
		• zaimplementowaæ metodê double obliczWartoscZRabatem, która oblicza wartoœæ pozycji zamówienia
			po uwzglêdnieniu rabatu zale¿nego od liczby sztuk:
				– 5–10 szt. rabat 5%,
				– 10–20 szt. rabat 10%
				– powy¿ej 20 szt. rabat 15%.
				
	4. Zmodyfikowaæ metodê obliczWartosc w klasie Zamowienie, tak by równie¿ wyœwietla³a informacje o rabacie
		i ³¹czny koszt zamówienia po jego uwzglêdnieniu.
	
	5. zmodyfikowaæ metodê toString , by wyœwietla³a równie¿ naliczony rabat i wartoœæ z rabatem.			
 */

public class zadanie3_4_5
{
	public static void main(String[] args)
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
		
		z.edytujPozycje(6);
		System.out.println(z);
	}
}