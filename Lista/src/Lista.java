import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/*
	Klasa ta ma mie� nast�puj�ce pola prywatne:
		� int [] liczby; � tablica, w kt�rej przechowywane b�d� liczby,
		� int pojemnosc; � maksymalna liczba element�w, mo�liwych do przechowywania,
		� int rozmiar; � aktualna liczba przechowywanych element�w.
	Klasa Lista powinna mie� r�wnie� nast�puj�ce metody:
		� konstruktor z parametrem okre�laj�cym pojemno��, kt�ry przydziela pami�� dla
			tablicy liczby oraz ustala warto�ci pozosta�ych p�l klasy;
		� metod� dodajElement , kt�ra przyjmuje dok�adnie jeden element � liczb� ca�kowit�, kt�ra dodawana jest do listy;
			w przypadku, gdy lista jest pe�na powinien zosta� wy�wietlony komunikat o b��dzie;
		� metod� znajdz , kt�rej jedynym parametrem powinna by� szukana liczba, natomiast wynikiem pozycja podanej liczby
			w li�cie (licz�c od 0) lub -1, gdy liczby nie ma na li�cie;
		� bezparametrow� metod� pisz , kt�ra wypisuje informacje o li�cie, w tym jej rozmiar, pojemno�� oraz list�
			przechowywanych element�w;
		� metod� usunPierwszy , kt�ra usuwa pierwsze wyst�pienie podanej jako parametr liczby, je�eli znajduje si� ona na li�cie,
		 	tzn. je�eli podana liczba wyst�puje wi�cej ni� jeden raz, to usuwane jest jedynie pierwsze jej wyst�pienie;
		� metod� usunPowtorzenia , kt�ra usuwa wszystkie powt�rzenia element�w na li�cie, tzn. po jej wykonaniu na li�cie
			nie powinno by� �adnych powt�rzonych liczb;
		� metod� odwroc , kt�ra odwraca kolejno�� element�w przechowywanych na li�cie;
		� metod� zapiszDoPliku , kt�ra zapisuje zawarto�� listy do pliku tekstowego, kt�rego nazwa podana powinna by�
			jako pierwszy parametr;
 */
public class Lista
{
// pola:
	private int[] liczby;
	private int pojemnosc;
	private int rozmiar;

// metody:
	Lista(int tmpPojemnosc)
	{
		pojemnosc = tmpPojemnosc;
		rozmiar = 0;
		liczby = new int[pojemnosc];	
	}
	void dodajElement(int liczba)
	{
		if(rozmiar < pojemnosc)
		{
			liczby[rozmiar] = liczba;
			rozmiar++;
		}
		else System.out.println("Nie mo�na doda� wi�cej element�w, lista pe�na!");
	}
	int znajdz(int szukana)
	{
		for(int i = 0; i < rozmiar-1; i++)
		{
			if(szukana == liczby[i]) return i;
		}
		return -1;
	}
	void pisz()
	{
		System.out.println("Lista:");
		System.out.println("Pojemnosc: "+ pojemnosc);
		System.out.println("Rozmiar: "+ rozmiar);
		System.out.print("Elementy:");
		for(int i = 0; i < rozmiar; i++) System.out.print(" "+liczby[i]);
		
		System.out.print("\n");
	}
	void usunPierwszy(int liczba)
	{
		int pierwsza = -1;
		pierwsza = znajdz(liczba);
		if(pierwsza != -1)
		{
			for(int i = pierwsza+1; i < rozmiar-1; i++)
			{
				if(liczby[i] == liczba)
				{
					for(int j = pierwsza; j < rozmiar-1; j++) liczby[j] = liczby[j+1];
					//liczby[rozmiar] = 0;
					rozmiar--;
				}
			}
		}
		else System.out.println("Nie ma takiej liczby w liscie :P");		
	}
	void usunPowtorzenia()
	{
		int[] temp = new int[pojemnosc];
		int tmpRozmiar = 0;
		boolean czy_byla = false;
		
		if(rozmiar >= 1)
		{
			temp[0] = liczby[0];
			tmpRozmiar = 1;
			
			for(int i = 1; i < rozmiar; i++)
			{
				czy_byla = false;
				for(int j = 0; j < tmpRozmiar; j++)
				{
					if(liczby[i] == temp[j])
					{
						czy_byla = true;
						break;
					}
				}
				if(czy_byla == false)
				{
					temp[tmpRozmiar] = liczby[i];
					tmpRozmiar++;
				}
			}
			rozmiar = tmpRozmiar;
			for(int i = 0; i < rozmiar-1; i++)
			{
				liczby[i] = temp[i];
			}
		}
		else System.out.println("nie ma co kasowac...");
	}
	void odwroc()
	{
		int[] temp = new int[pojemnosc];
		int licznik = 0;
		for(int i = rozmiar; i > 1; i--)
		{
			temp[licznik] = liczby[i];
			licznik++;
		}
	}
	void zapiszDoPliku(String NazwaPliku) throws FileNotFoundException
	{
		PrintWriter out = new PrintWriter(NazwaPliku+".txt");		// obiekt do zapisu danych do pliku
		for(int i = 0; i < rozmiar; i++) out.print(" "+liczby[i]);
		out.close();
	}
}
