
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
			String paragon = "\nZam�wienie: \n";
			String tempWartosc = "";
			
			for(int j = 0; j < ileDodanych; j++)paragon += pozycje[j].toString() + "\n";
			
			tempWartosc = Double.toString(obliczWartosc()) + " z�";
			for(int i = tempWartosc.length()-1; i <= 10; i++)	tempWartosc += " ";

			paragon += ("\nRazem: " + tempWartosc);
			
			return paragon; 
		}
}

/*
Klasa Zamowienie powinna zawiera� nast�puj�ce pola:
� pozycje (tablica obiekt�w kl. Pozycja) � pozycje sk�adowe zam�wienia,
� ileDodanych (int) � liczba pozycji w zam�wieniu,
� maksRozmiar (int) � maksymalna liczba pozycji w zam�wieniu

oraz metody:
� konstruktor bezparametrowy � maksRozmiar ustalany na warto�� 10,
� konstruktor z parametrem okre�laj�cym maksymaln� liczb� pozycji w zam�wieniu,
� metod� void dodajPozycje(Pozycja p) , kt�ra dodaje podan� pozycj� do zam�wienia,
� metod� double obliczWartosc() zwracaj�c� warto�� zam�wienia,
� metod� String toString() , kt�ra zwraca �a�cuch zawieraj�cy spis pozycji zam�wienia oraz ��czn� warto�� zam�wienia.
*/