import java.util.Scanner;

// TEMAT 2

/*
	6. Napisa� program realizuj�cy funkcje prostego kalkulatora, pozwalaj�cego na wykonywanie
		operacji dodawania, odejmowania, mno�enia i dzielenia na dw�ch liczbach rzeczywistych.
		Program ma identyfikowa� sytuacj� wprowadzenia b��dnego symbolu dzia�ania oraz pr�b� dzielenia przez zero.
		Zastosowa� instrukcj� switch do wykonania odpowiedniego dzia�ania w zale�no�ci od wprowadzonego symbolu operacji.
	
	Scenariusz dzia�ania programu:
		a) Program wy�wietla informacj� o swoim przeznaczeniu.
		b) Wczytuje pierwsz� liczb�.
		c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
		d) Wczytuje drug� liczb�.
		e) Wy�wietla wynik lub - w razie konieczno�ci - informacj� o niemo�no�ci wykonania dzia�ania.
		f) Program ko�czy swoje dzia�anie po naci�ni�ciu przez u�ytkownika klawisza Enter.
 */

public class zadanie6
{
	public static void main(String[] args) 
	{
		System.out.println("Witaj! Przed toba najlepszy kalkulator liczb rzeczywistych napisany w j�zyku Java!");

// Pobieranie pierwszej liczby
		double a = 0.0;
		String tempS = " ";
		Scanner in = new Scanner(System.in);
		boolean czy_ok = false;
		
		while(czy_ok != true)
		{
			try
			{
				System.out.print("Podaj pierwsz� liczb�: ");
				tempS = in.next();
				tempS = tempS.replace(',' , '.');	// funkcja replace(char1, char2) zamienia znaki char1 w stringu tempS na char2 
				a = Double.parseDouble(tempS);
				czy_ok = true;
			}
			catch(NumberFormatException e)
			{
				System.out.println("ERROR 'NumberFormatException' ! Podano b��dn� warto��!");
				czy_ok = false;
			}
			catch(NullPointerException e)
			{
				System.out.println("ERROR 'NullPointerException' ! Podano b��dn� warto��!");
				czy_ok = false;
			}
		}
		
		
// Pobieranie symbolu operacji
		tempS = " ";
		char znak = ' ';
		czy_ok = false;
		
		while(czy_ok != true)
		{
			System.out.print("Podaj symbol operacji arytmetycznej: [+, -, *, / ] : ");
			tempS = in.next();
			znak = tempS.charAt(0); 	//pobiera pierwszy znak z stringa aby uniknac wpisania np. ++++
			
			switch(znak)
			{
				case '+': {czy_ok=true; break;}
				case '-': {czy_ok=true; break;}
				case '*': {czy_ok=true; break;}
				case '/': {czy_ok=true; break;}
				default :
				{
					System.out.println("Podano b��dny symbol operacji arytmetycznej, spr�buj ponownie!");
					break;
				}
			}
		}
			
		
// Pobieranie drugiej liczby		
        double b = 0.0;
        tempS = " ";
        czy_ok = false;
		
		while(czy_ok != true)
		{
			try
			{
				System.out.print("Podaj drug� liczb�: ");
				tempS = in.next();
				tempS = tempS.replace(',' , '.');	// funkcja replace(char1, char2) zamienia znaki char1 w stringu tempS na char2 
				b = Double.parseDouble(tempS);
				
				if(znak == '/' && b == 0.0)
				{
					System.out.print("Nie dziel przez zero!!!");
					czy_ok = false;
				}
				else czy_ok = true;				
			}
			catch(NumberFormatException e)
			{
				System.out.println("ERROR 'NumberFormatException' ! Podano b��dn� warto��!");
				czy_ok = false;
			}
			catch(NullPointerException e)
			{
				System.out.println("ERROR 'NullPointerException' ! Podano b��dn� warto��!");
				czy_ok = false;
			}
		}
		
		
// Wykonanie dzialania	
		int asci = (int)znak;
		double wynik = 0.0;
		
		switch (asci)
		{
			case 43:
			{
				wynik = a + b;
				System.out.print(a + " + " + b + " = " + wynik);
				break;
			}
			case 45:
			{
				wynik = a - b;
				System.out.print(a + " - " + b + " = " + wynik);
				break;
			}
			case 42:
			{
				wynik = a * b;
				System.out.print(a + " * " + b + " = " + wynik);
				break;
			}
			case 47:
			{
				wynik = a / b;
				System.out.print(a + " / " + b + " = " + wynik);
				break;
			}
			default:
			{
				
				break;
			}
		
		}
	
		in.close();
	}
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////
//import java.util.HashSet;
//znakS = in.nextLine();
		//znak = znakS.charAt(0); 	//pobiera pierwszy znak z stringa
		/*HashSet<Character> Znaki = new HashSet<>();
		Znaki.add('+');
		Znaki.add('-');
		Znaki.add('*');
		Znaki.add('/');
		System.out.println("Podaj symbol operacji arytmetycznej: +, -, *, / ");
		try 
		{
			znak = (char)System.in.read();
			asci = (int)znak;
			Znaki.contains(znak); //true/false
		} 
		catch (IOException e) 
		{
			System.out.println("Podano b��dny symbol operacji arytmetycznej, spr�buj ponownie!");
	        in.nextLine();
			e.printStackTrace();
		} */
		
		/*if(!(asci == 42 || asci == 43 || asci == 45 || asci == 47))*/
