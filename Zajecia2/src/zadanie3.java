import java.util.Scanner;

// TEMAT 2

/*
	3. Napisa� program, kt�ry wczytuje od u�ytkownika liczb� ca�kowit� dodatni� n,
	a nast�pnie wy�wietla na ekranie wszystkie pot�gi liczby 2 nie wi�ksze, ni� podana liczba.
	
	Przyk�adowo, dla liczby 71 program powinien wy�wietli�:
	1
	2
	4
	8
	16
	32
	64

 */

/*
public class zadanie3
{
	public static void main(String[] args)
	{
		int n = 0, i = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Podaj liczbe ca�kowit� n: ");
		n = in.nextInt();
		
		if(n >= 2)
		{
			while(Math.pow(2, i) < n)
			{
				System.out.println((int)Math.pow(2, i));
				i++;
			}
		}
		else System.out.println("Podales zbyt mala liczbe n !");

	}
}
*/