
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
		String tempCena = Double.toString(cena) + " z�";
		String tempIle = Integer.toString(ileSztuk) + " szt.";
		String tempWartosc = Double.toString(obliczWartosc()) + " z�";
		
		for(int i = nazwaTowaru.length()-1; i <= 20; i++) 	nazwaTowaru += " ";
		for(int i = tempCena.length()-1; i <= 10; i++) 		tempCena += " ";
		for(int i = tempIle.length()-1; i <= 4; i++)		tempIle += " ";
		for(int i = tempWartosc.length()-1; i <= 10; i++)	tempWartosc += " ";
		
		return nazwaTowaru + " | " + tempCena + " | " + tempIle + " | " + tempWartosc;  
	}
}

/*
Klasa Pozycja powinna zawiera� nast�puj�ce pola:
� nazwaTowaru (String)
� ileSztuk (int) � liczba zam�wionych sztuk
� cena (double) � cena pojedynczej sztuki

oraz metody:
� konstruktor z parametrami umo�liwiaj�cymi ustalenie warto�ci p�l klasy,
� metod� double obliczWartosc() zwracaj�c� warto�� pozycji zam�wienia,
� metod� String toString() zwracaj�c� �a�cuch w formacie: nazwa towaru
	(20 znak�w), cena (10 znak�w), liczba sztuk (4 znaki), warto�� zam�wienia (10 znak�w), przyk�ad:
	
		Cukier 				4,00 z� 		 3 szt. 		12,00 z�
*/