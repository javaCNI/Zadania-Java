
public class Pozycja
{
// zmienne
	public String nazwaTowaru = "";
	public int ileSztuk = 0;
	public double cena = 0;
// metody
	public Pozycja(String a, int b, double c)
	{
		nazwaTowaru = a;
		ileSztuk = b;
		cena = c;
	}
	public double obliczWartosc()
	{
		return ileSztuk * cena;
	}
	public String toString()
	{
		String tempCena = Double.toString(cena) + " z³";
		String tempIle = Integer.toString(ileSztuk) + " szt.";
		String tempWartosc = Double.toString(obliczWartosc()) + " z³";
		
		for(int i = nazwaTowaru.length()-1; i <= 20; i++) 	nazwaTowaru += " ";
		for(int i = tempCena.length()-1; i <= 10; i++) 		tempCena += " ";
		for(int i = tempIle.length()-1; i <= 4; i++)		tempIle += " ";
		for(int i = tempWartosc.length()-1; i <= 10; i++)	tempWartosc += " ";
		
		return nazwaTowaru + " | " + tempCena + " | " + tempIle + " | " + tempWartosc;  
	}
}

/*
Klasa Pozycja powinna zawieraæ nastêpuj¹ce pola:
• nazwaTowaru (String)
• ileSztuk (int) – liczba zamówionych sztuk
• cena (double) – cena pojedynczej sztuki

oraz metody:
• konstruktor z parametrami umo¿liwiaj¹cymi ustalenie wartoœci pól klasy,
• metodê double obliczWartosc() zwracaj¹c¹ wartoœæ pozycji zamówienia,
• metodê String toString() zwracaj¹c¹ ³añcuch w formacie: nazwa towaru
	(20 znaków), cena (10 znaków), liczba sztuk (4 znaki), wartoœæ zamówienia (10 znaków), przyk³ad:
	
		Cukier 				4,00 z³ 		 3 szt. 		12,00 z³
*/