import java.util.Scanner;

//TEMAT 2

/*
	5. W sklepie ze sprz�tem AGD oferowana jest sprzeda� ratalna.
	Napisz program umo�liwiaj�cy wyliczenie wysoko�ci miesi�cznej raty za zakupiony sprz�t.
	- Danymi wej�ciowymi dla programu s�:
		� cena towaru (od 100 z� do 10 ty�. z�),
		� liczba rat (od 6 do 48).
		
	- Kredyt jest oprocentowany w zale�no�ci od liczby rat:
		� od 6�12 wynosi 2.5% ,
		� od 13�24 wynosi 5%,
		� od 25�48 wynosi 10%.
	- Obliczona miesi�czna rata powinna zawiera� r�wnie� odsetki. Program powinien
		sprawdza�, czy podane dane mieszcz� si� w okre�lonych powy�ej zakresach, a w
		przypadku b��du pyta� prosi� u�ytkownika ponownie o podanie danych.
*/

/*
public class zadanie5
{
	public static void main(String[] args)
	{
		double cenaTowaru = 0.0, oplaty = 0.0;
		int raty = 0;
		Scanner in = new Scanner(System.in);
		
		while(cenaTowaru < 100.0 || cenaTowaru > 10000.0)
		{
			System.out.print("Podaj cene towaru [100z� - 10k z�] : ");
			cenaTowaru = in.nextDouble();
			
			if(cenaTowaru < 100.0 || cenaTowaru > 10000.0)
			{
				System.out.println("Podano zla wartosc, sprobuj ponownie!");
			}
		}
		
		while(raty < 6 || raty > 48)
		{
			System.out.print("Podaj ilosc rat [6-48] : ");
			raty = in.nextInt();
			
			if(raty < 6 || raty > 48)
			{
				System.out.println("Podano zla wartosc, sprobuj ponownie!");
			}
		}
		
		
		if(raty >= 6 && raty <= 12)
		{
			cenaTowaru+=cenaTowaru*0.025;
			oplaty = cenaTowaru/raty;
		}
		if(raty >= 13 && raty <= 24)
		{
			cenaTowaru+=cenaTowaru*0.05;
			oplaty = cenaTowaru/raty;
		}
		if(raty >= 25 && raty <= 48)
		{
			cenaTowaru+=cenaTowaru*0.1;
			oplaty = cenaTowaru/raty;
		}
		
		System.out.println("Za towar zaplacisz wiec " + cenaTowaru + " z�, w " + raty + " ratach po " + oplaty + " z�.");
		in.close();
	}
}

*/