/*
Klasa ta powinna mieæ dwa pola prywatne:
• int godz;
• int minuty;

oraz metody publiczne:
• konstruktor z parametrami bêd¹cymi liczb¹ godzin i minut,
• konstruktor przyjmuj¹cy jako parametr ³añcuch znaków na podstawie którego mo¿na ustaliæ wartoœæ
	godzin i minut np. ”12 h 58 min”
• String toString() której wynikiem jest ³añcuch znaków opisuj¹cy dany okres czasu, np. ”29 h 19 min”
• Czas dodaj(Czas t) której wynikiem jest nowy obiekt klasy Czas bêd¹cy sum¹ bie¿¹cego i podanego jako parametr obiektu
• Czas odejmij(Czas t) analogicznie jak dodaj, tyle ¿e odejmowanie,
• Czas pomnoz(int ile) wynikiem ma byæ okres czasu pomno¿ony podan¹ liczbê razy,
• static Czas sumuj(Czas [] tab, int n) statyczna metoda klasy s³u¿¹ca do sumowania wszystkich okresów
	czasu podanych w tablicy bêd¹cej pierwszym parametrem
 */



public class Czas
{
// pola	
	private int godz;
	private int minuty;
// metody
	public Czas(int h, int min)
	{
		godz = h; 
		minuty = min;
		
		while(minuty >= 60)
		{
			minuty -= 60;
			godz++;
		}
	}
	public Czas(String czas)
	{		
		//String h = czas.substring(0, czas.indexOf('h')-1);
		//String min = czas.substring(czas.indexOf('h')+2, czas.indexOf('m')-1);
		godz = Integer.parseInt(czas.substring(0, czas.indexOf('h')-1));
		minuty = Integer.parseInt(czas.substring(czas.indexOf('h')+2, czas.indexOf('m')-1));
		
		while(minuty >= 60)
		{
			minuty -= 60;
			godz++;
		}
	}
	public String toString() {return Integer.toString(godz)+" h "+Integer.toString(minuty)+" min";}
	public Czas dodaj(Czas t)
	{
		Czas A = new Czas(0,0);
		A.godz = godz + t.godz;
		A.minuty = minuty + t.minuty;
		
		while(A.minuty >= 60)
		{
			A.minuty -= 60;
			A.godz++;
		}
		return A;
	}
	public Czas odejmij(Czas t)
	{
		Czas A = new Czas(0,0);
		A.godz = Math.abs(godz - t.godz);
		A.minuty = Math.abs(minuty - t.minuty);
		
		while(A.minuty >= 60)
		{
			A.minuty -= 60;
			A.godz++;
		}
		return A;
	}
	public Czas pomnoz(int ile)
	{
		Czas A = new Czas(0,0);
		A.godz = godz * ile;
		A.minuty = minuty * ile;
		
		while(A.minuty >= 60)
		{
			A.minuty -= 60;
			A.godz++;
		}
		return A;
	}
	public static Czas sumuj(Czas[] tab, int n)
	{
		Czas A = new Czas(0,0);
		for(int i = 0; i < n; i++)
		{
			A.godz += tab[i].godz;
			A.minuty += tab[i].minuty;
		}
		while(A.minuty >= 60)
		{
			A.minuty -= 60;
			A.godz++;
		}
		return A;
	}
}
