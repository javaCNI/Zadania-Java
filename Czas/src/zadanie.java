/*
Zad. Czas
Napisaæ klasê Czas s³u¿¹c¹ do zapamiêtania okresu czasu tj. liczby godzin i minut.
 */
public class zadanie
{
	public static void main(String[] args)
	{
		Czas t1 = new Czas(10, 56);
		Czas t2 = new Czas(0, 123);
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t1 + t2 = " + t1.dodaj(t2));
		System.out.println("t1 - t2 = " + t1.odejmij(t2));
		Czas [] tab = { t1, t2, t2 };
		System.out.println("Czas.sumuj dla t1 + t2 + t2 = " + Czas.sumuj(tab, 3));
		System.out.println("t1 * 2 = " + t1.pomnoz(2));
		Czas t3 = new Czas("3 h 17 min");
		System.out.println("Konstruktor z ³añcuchem: " + t3);
	}
}

/*
Przyk³adowy program:
Czas t1(10, 56);
Czas t2(0, 123);
System.out.println("t1 = " + t1);
System.out.println("t2 = " + t2);
System.out.println("t1 + t2 = " + t1.dodaj(t2));
System.out.println("t1 - t2 = " + t1.odejmij(t2);
Czas [] tab = { t1, t2, t2 };
System.out.println("Czas.sumuj dla t1 + t2 + t2 = " +
Czas.sumuj(tab, 3));
System.out.println("t1 * 2 = " + t1.pomnoz(2));
Czas t3("3 h 17 min");
System.out.println("Konstruktor z ³añcuchem: " + t3);

Wydruk dla przyk³adowego programu:
	t1 = 10 h 56 min
	t2 = 2 h 3 min
	t1 + t2 = 12 h 59 min
	t1 - t2 = 8 h 53 min
	Czas.sumuj dla t1 + t2 + t2 = 15 h 2 min
	t1 * 2 = 21 h 52 min
	Konstruktor z ³añcuchem: 3 h 17 min
*/