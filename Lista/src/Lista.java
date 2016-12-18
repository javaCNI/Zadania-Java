import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/*
	Klasa ta ma mieæ nastêpuj¹ce pola prywatne:
		• int [] liczby; – tablica, w której przechowywane bêd¹ liczby,
		• int pojemnosc; – maksymalna liczba elementów, mo¿liwych do przechowywania,
		• int rozmiar; – aktualna liczba przechowywanych elementów.
	Klasa Lista powinna mieæ równie¿ nastêpuj¹ce metody:
		• konstruktor z parametrem okreœlaj¹cym pojemnoœæ, który przydziela pamiêæ dla
			tablicy liczby oraz ustala wartoœci pozosta³ych pól klasy;
		• metodê dodajElement , która przyjmuje dok³adnie jeden element – liczbê ca³kowit¹, która dodawana jest do listy;
			w przypadku, gdy lista jest pe³na powinien zostaæ wyœwietlony komunikat o b³êdzie;
		• metodê znajdz , której jedynym parametrem powinna byæ szukana liczba, natomiast wynikiem pozycja podanej liczby
			w liœcie (licz¹c od 0) lub -1, gdy liczby nie ma na liœcie;
		• bezparametrow¹ metodê pisz , która wypisuje informacje o liœcie, w tym jej rozmiar, pojemnoœæ oraz listê
			przechowywanych elementów;
		• metodê usunPierwszy , która usuwa pierwsze wyst¹pienie podanej jako parametr liczby, je¿eli znajduje siê ona na liœcie,
		 	tzn. je¿eli podana liczba wystêpuje wiêcej ni¿ jeden raz, to usuwane jest jedynie pierwsze jej wyst¹pienie;
		• metodê usunPowtorzenia , która usuwa wszystkie powtórzenia elementów na liœcie, tzn. po jej wykonaniu na liœcie
			nie powinno byæ ¿adnych powtórzonych liczb;
		• metodê odwroc , która odwraca kolejnoœæ elementów przechowywanych na liœcie;
		• metodê zapiszDoPliku , która zapisuje zawartoœæ listy do pliku tekstowego, którego nazwa podana powinna byæ
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
		else System.out.println("Nie mo¿na dodaæ wiêcej elementów, lista pe³na!");
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
