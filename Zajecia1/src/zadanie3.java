import java.util.Scanner;
import java.lang.Math;

//TEMAT 2

/*
	3. Napisa� program, kt�ry oblicza warto�� wsp�czynnika BMI (ang. body mass index) wg. wzoru: waga/(wzrost)^2 .
	- Je�eli wynik jest w przedziale (18,5 - 24,9) to wypisuje �waga prawid�owa�, je�eli poni�ej to �niedowaga�,
	je�eli powy�ej �nadwaga�.
 */

/*
public class zadanie3
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		double BMI = 0.0, waga = 0.0, wzrost = 0.0;
		
		System.out.print("Podaj swoja wage w kilogramach: ");
		waga = in.nextDouble();
		System.out.print("Podaj swoj wzrost w centymetrach: ");
		wzrost = in.nextDouble()/100;		// dzielimy przez 100 aby zamienic cm na m
		
		BMI = waga/(Math.pow(wzrost, 2));
		System.out.println("Twoje BMI = " + BMI);
		
		if(BMI > 18.5  &&  BMI < 24.9) System.out.println("Gratulacje! Waga prawid�owa!");
		else if(BMI < 18.5) System.out.println("Niestety..:( masz niedowag�");
		else if(BMI > 24.9) System.out.println("Niestety..:( masz nadwag�");
	}
}

*/

// TIP:		*funkcja pow pozwala pot�gowa� liczb� a do pot�gi b, jest wygodna gdy mamy du�e pot�gi.
