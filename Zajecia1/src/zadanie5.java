import java.util.Scanner;

//TEMAT 2

/*
	5. W sklepie ze sprzêtem AGD oferowana jest sprzeda¿ ratalna.
	Napisz program umo¿liwiaj¹cy wyliczenie wysokoœci miesiêcznej raty za zakupiony sprzêt.
	- Danymi wejœciowymi dla programu s¹:
		• cena towaru (od 100 z³ do 10 tyœ. z³),
		• liczba rat (od 6 do 48).
		
	- Kredyt jest oprocentowany w zale¿noœci od liczby rat:
		• od 6–12 wynosi 2.5% ,
		• od 13–24 wynosi 5%,
		• od 25–48 wynosi 10%.
	- Obliczona miesiêczna rata powinna zawieraæ równie¿ odsetki. Program powinien
		sprawdzaæ, czy podane dane mieszcz¹ siê w okreœlonych powy¿ej zakresach, a w
		przypadku b³êdu pytaæ prosiæ u¿ytkownika ponownie o podanie danych.
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
			System.out.print("Podaj cene towaru [100z³ - 10k z³] : ");
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
		
		System.out.println("Za towar zaplacisz wiec " + cenaTowaru + " z³, w " + raty + " ratach po " + oplaty + " z³.");
		in.close();
	}
}

*/