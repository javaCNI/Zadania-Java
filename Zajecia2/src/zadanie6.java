import java.util.Random;
import java.util.Scanner;

// TEMAT 2

/*
	6. Gra w �Za du�o, za ma�o�. 
	- Komputer losuje liczb� z zakresu 1 . . . 100, a gracz (u�ytkownik) ma za zadanie
		odgadn��, co to za liczba poprzez podawanie kolejnych warto�ci.
	- Je�eli podana warto�� jest:
		� wi�ksza � wy�wietlany jest komunikat �Poda�e� za du�� warto��,
		� mniejsza � wy�wietlany jest komunikat �Poda�e� za ma�� warto��,
		� identyczna z wylosowan� � wy�wietlany jest komunikat �Gratulacje� i gra si� ko�czy.
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
		
		System.out.println("System wylosowa� liczb� calkowit� z przedzia�u 1-100, zgadnij jak� !");
		do
		{
			liczba = in.nextInt();
			
			if(liczba < losowa) System.out.println("Poda�e� za ma�� warto��");
			if(liczba > losowa) System.out.println("Poda�e� za du�� warto��");
			if(liczba == losowa) System.out.println("Gratulacje");
			
		}while(liczba != losowa);
	}
}
*/
