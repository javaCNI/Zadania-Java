import java.util.Scanner;

// TEMAT 2

/*
	5. Napisaæ program, który pobiera od u¿ytkownika ci¹g liczb ca³kowitych.
	- Pobieranie danych koñczone jest podaniem wartoœci 0 (nie wliczana do danych).
	- W nastêpnej kolejnoœci program powinien wyœwietliæ sumê najwiêkszej oraz najmniejszej z
		podanych liczb oraz ich œredni¹ arytmetyczn¹.
	
	*Przyk³ad:
		U¿ytkownik poda³ ci¹g: 1, -4, 2, 17, 0.
		Wynik programu:
			13 // suma min. i maks.
			6.5 // œrednia
 */

/*
public class zadanie5
{
	public static void main(String[] args)
	{
		int liczba = 0, suma = 0, min=0, max = 0;
		double srednia = 0.0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Podaj liczby do sumowania (jesli podasz 0 zakonczysz petle) ");
		
		do
		{
			liczba = in.nextInt();
			
			if(min == 0 && liczba != 0) min = liczba;
			
			min = (min < liczba ? min : liczba);
			max = (max > liczba ? max : liczba);
			
		}while(liczba != 0);
		suma = min + max;
		if(min == 0 || max == 0) srednia = (double)suma/1;
		else srednia = (double)suma/2;
		System.out.println( suma + " // suma min. i maks.");
		System.out.println( srednia + " // œrednia.");
	}
}
*/