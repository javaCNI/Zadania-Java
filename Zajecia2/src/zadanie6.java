import java.util.Random;
import java.util.Scanner;

// TEMAT 2

/*
	6. Gra w ”Za du¿o, za ma³o”. 
	- Komputer losuje liczbê z zakresu 1 . . . 100, a gracz (u¿ytkownik) ma za zadanie
		odgadn¹æ, co to za liczba poprzez podawanie kolejnych wartoœci.
	- Je¿eli podana wartoœæ jest:
		• wiêksza – wyœwietlany jest komunikat „Poda³eœ za du¿¹ wartoœæ”,
		• mniejsza – wyœwietlany jest komunikat „Poda³eœ za ma³¹ wartoœæ”,
		• identyczna z wylosowan¹ – wyœwietlany jest komunikat „Gratulacje” i gra siê koñczy.
 */

/*
public class zadanie6
{
	public static void main(String[] args)
	{
		Random generator = new Random();
		Scanner in = new Scanner(System.in);
		int losowa = 0, liczba = 0;
		
		losowa = generator.nextInt(100) + 1;
		
		System.out.println("System wylosowa³ liczbê calkowit¹ z przedzia³u 1-100, zgadnij jak¹ !");
		do
		{
			liczba = in.nextInt();
			
			if(liczba < losowa) System.out.println("Poda³eœ za ma³¹ wartoœæ");
			if(liczba > losowa) System.out.println("Poda³eœ za du¿¹ wartoœæ");
			if(liczba == losowa) System.out.println("Gratulacje");
			
		}while(liczba != losowa);
	}
}
*/
