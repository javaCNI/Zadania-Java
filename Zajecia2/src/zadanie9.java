import java.util.Scanner;

// TEMAT 2

/*
	9. Napisa� program, kt�ry pobiera od u�ytkownika liczb� ca�kowit�, a nast�pnie:
		� oblicza sum� cyfr tej liczby,
		� stosunek �redniej arytmetycznej cyfr parzystych do �redniej arytmetycznej cyfr nieparzystych.
 */

/*
public class zadanie9
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		String liczba = "";
		int suma = 0;
		
		
		System.out.print("Podaj liczbe ca�kowit�: ");
		liczba = in.nextLine();
		liczba.trim();     // kasuje biale znaki na pocz�tku i na ko�cu stringa
		
		for(int i=0; i<liczba.length(); i++)
		{
			suma += Character.getNumericValue(liczba.charAt(i));		// pobiera inta z chara
			//System.out.println("Liczba: " + liczba.charAt(i));
		}
		System.out.println("suma = " + suma);
		
		int temp = 0, liczP = 0, liczNP = 0;
		double sredniaP = 0.0, sredniaNP = 0.0, wynik = 0.0;
		
		for(int i=0; i<liczba.length(); i++)
		{
			temp = Character.getNumericValue(liczba.charAt(i));
			if(temp % 2 == 0) 
			{
				//System.out.println("Liczba P: " + liczba.charAt(i));
				sredniaP += temp;
				liczP++;
			}
			else 
			{
				//System.out.println("Liczba NP: " + liczba.charAt(i));
				sredniaNP += temp;
				liczNP++;
			}
		}
		//System.out.println("SumaP = " + sredniaP + ", SumaNP = " + sredniaNP);
		wynik = (sredniaP/liczP) / (sredniaNP/liczNP);
		System.out.println("stosunek �redniej arytmetycznej cyfr P do �redniej arytmetycznej cyfr NP = " + wynik);
	}
}
*/