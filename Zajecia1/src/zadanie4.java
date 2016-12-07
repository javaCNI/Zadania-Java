import java.util.Scanner;

//TEMAT 2

/*
	4. Napisaæ program obliczaj¹cy nale¿ny podatek dochodowy od osób fizycznych.
	Program ma pobieraæ od u¿ytkownika dochód i po obliczeniu wypisywaæ na ekranie
	nale¿ny podatek, który obliczany jest wg. nastêpuj¹cych regu³:
		• do 85 528 podatek wynosi 18% podstawy minus 556,02 PLN,
		• od 85 528 podatek wynosi 14.839,02 z³ + 32% nadwy¿ki ponad 85.528,00
 */

/*
public class zadanie4
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double kwota = 0.0, podatek = 0.0, netto = 0.0;
		System.out.print("Podaj sume swoich zarobkow brutto: ");
		kwota = in.nextFloat();
		
		if(kwota <= 85528.0)
		{
			podatek = 0.18*(kwota-556.02);
			netto = kwota-podatek;
			System.out.print("Twój podatek wynosi " + podatek + " z³, wiêc 'na czysto' zarobisz " + netto + " z³.");
		}
		else
		{
			podatek = 14839.02 + 0.32*(kwota-85528.0);
			netto = kwota-podatek;
			System.out.print("Twój podatek wynosi " + podatek + " z³, wiêc 'na czysto' zarobisz " + netto + " z³.");
		}
	}

}
*/

// TIP  *Pamietaj ze podawana przez uzytkownika wartosc to kwota brutto!
//			*netto - tyle ile dostajesz na reke
//			*brutto - tyle bys zarabial gdyby nie kochane podatki i tyle masz wpisane w umowie o prace