import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zamowienie
{
	// zmienne
		public Pozycja[] pozycje;
		public int ileDodanych;
		public int maksRozmiar;
	// metody
		public Zamowienie()
		{
			maksRozmiar = 10;
			ileDodanych = 0;
			pozycje = new Pozycja[10];
		}
		
		public Zamowienie(int maxSize)
		{
			maksRozmiar = maxSize;
			ileDodanych = 0;
			pozycje = new Pozycja[maksRozmiar];
		}
		
		public void dodajPozycje(Pozycja p)
		{	
			boolean czy_byla = false;
			int i = 0;
			while( i < ileDodanych) {if(p.nazwaTowaru == pozycje[i].nazwaTowaru) czy_byla = true; i++;}
			
			if(czy_byla == true) pozycje[i-1].ileSztuk += p.ileSztuk;
			else
			{
				pozycje[ileDodanych] = p;
				ileDodanych++;
			}
			
		}
		
		void usunPozycje(int indeks)  // usuwa z zam�wienia pozycj� o podanym indeksie
		{
			int i = indeks;
			if(indeks != maksRozmiar-1) while(i < ileDodanych-1) {pozycje[i] = pozycje[i+1]; i++;}
			
			pozycje[i] = new Pozycja("", 0, 0);
			ileDodanych--;
		}
		
		public double obliczWartosc()
		{
			double suma = 0.0;
			for(int i = 0; i < ileDodanych; i++)
			{
				suma += (pozycje[i].obliczWartoscZRabatem());
			}
			
			return suma;
		}
		
		void edytujPozycje(int indeks) //, kt�ra umo�liwi edycj� wybranej pozycji zam�wienia, tj. nazwy towaru, ceny oraz liczby sztuk
		{
			String Tnazwa = "";
			int Tilosc = 0;
			double Tcena = 0;
			Scanner in = new Scanner(System.in);
			System.out.print("Podaj nowa nazwe towaru: ");
			Tnazwa = in.nextLine();
			System.out.print("Podaj cene: ");
			Tcena = in.nextDouble();
			System.out.print("Podaj ilosc: ");
			Tilosc = in.nextInt();
			pozycje[indeks] = new Pozycja(Tnazwa, Tilosc, Tcena);
			in.close();
		}
		public static void zapiszZamowienie(Zamowienie z, String nazwaPliku) throws FileNotFoundException
		{
			//String dir = System.getProperty("user.dir");		// w zmiennej dir zostanie zapisana sciezka do katalogu poczatkowego
																		// 		w ktorym uruchomiono program
			PrintWriter out = new PrintWriter(nazwaPliku+".txt");		// obiekt do zapisu danych do pliku
			
			out.println(z);
			
			out.close();
		}
		public String wczytajZamowienie(String nazwaPliku) throws IOException
		{
			//String dir = System.getProperty("user.dir");		// w zmiennej dir zostanie zapisana sciezka do katalogu poczatkowego
																	// 		w ktorym uruchomiono program
			Scanner in = new Scanner(Paths.get(nazwaPliku+".txt"));	// obiekt do pobierania danych z pliku
			
			//out.println(z);
			String tekst = in.nextLine();
			in.close();
			
			//System.out.println(z);
			return tekst;
		}
		
		public String toString()
		{
			String paragon = "\nZam�wienie: \n";
			String tempWartosc = "";
			
			for(int j = 0; j < ileDodanych; j++)paragon += j + "." + pozycje[j].toString() + "\n";
			
			tempWartosc = Double.toString(obliczWartosc()) + " z�";
			for(int i = tempWartosc.length()-1; i <= 10; i++)	tempWartosc += " ";

			paragon += ("\nRazem: " + tempWartosc);
			
			return paragon; 
		}
}