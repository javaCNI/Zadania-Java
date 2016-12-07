
public class Zamowienie extends Pozycja
{
	// zmienne
		public Pozycja[] pozycje;
		public int ileDodanych;
		public int maksRozmiar;
	// metody
		public Zamowienie()
		{
			super("", 0, 0.0);
			maksRozmiar = 10;
			ileDodanych = 0;
			pozycje = new Pozycja[10];
		}
		
		public Zamowienie(int maxSize)
		{
			super("", 0, 0.0);
			maksRozmiar = maxSize;
			ileDodanych = 0;
			pozycje = new Pozycja[maksRozmiar];
		}
		
		public void dodajPozycje(Pozycja p)
		{
			pozycje[ileDodanych] = p;
			ileDodanych++;
		}
		
		public double obliczWartosc()
		{
			double suma = 0.0;
			for(int i = 0; i < ileDodanych; i++)
			{
				suma += (pozycje[i].obliczWartosc());
			}
			
			return suma;
		}
		
		public String toString()
		{
			String paragon = "\nZamówienie: \n";
			String tempWartosc = "";
			
			for(int j = 0; j < ileDodanych; j++)paragon += pozycje[j].toString() + "\n";
			
			tempWartosc = Double.toString(obliczWartosc()) + " z³";
			for(int i = tempWartosc.length()-1; i <= 10; i++)	tempWartosc += " ";

			paragon += ("\nRazem: " + tempWartosc);
			
			return paragon; 
		}
}

/*
Klasa Zamowienie powinna zawieraæ nastêpuj¹ce pola:
• pozycje (tablica obiektów kl. Pozycja) – pozycje sk³adowe zamówienia,
• ileDodanych (int) – liczba pozycji w zamówieniu,
• maksRozmiar (int) – maksymalna liczba pozycji w zamówieniu

oraz metody:
• konstruktor bezparametrowy – maksRozmiar ustalany na wartoœæ 10,
• konstruktor z parametrem okreœlaj¹cym maksymaln¹ liczbê pozycji w zamówieniu,
• metodê void dodajPozycje(Pozycja p) , która dodaje podan¹ pozycjê do zamówienia,
• metodê double obliczWartosc() zwracaj¹c¹ wartoœæ zamówienia,
• metodê String toString() , która zwraca ³añcuch zawieraj¹cy spis pozycji zamówienia oraz ³¹czn¹ wartoœæ zamówienia.
*/