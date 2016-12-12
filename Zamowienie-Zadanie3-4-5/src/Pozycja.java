
public class Pozycja
{
// zmienne
	public String nazwaTowaru = "";
	public int ileSztuk = 0;
	public double cena = 0;
	String rabat = "";
// metody
	public Pozycja(String a, int b, double c)
	{
		nazwaTowaru = a;
		ileSztuk = b;
		cena = c;
	}
	public double obliczWartosc()
	{
		return ileSztuk * cena;
	}
	double obliczWartoscZRabatem()
	{
		if(ileSztuk >= 5 && ileSztuk < 10)
		{
			rabat = "w tym 5% rabatu = " + Double.toString(obliczWartosc() * 0.05) + "z³";
			return obliczWartosc() * 0.95;
		}
		else if(ileSztuk >= 10 && ileSztuk < 20)
		{
			rabat = "w tym 10% rabatu" + Double.toString(obliczWartosc() * 0.10) + "z³";
			return obliczWartosc() * 0.90;
		}
		else if(ileSztuk >= 20)
		{
			rabat = "w tym 15% rabatu" + Double.toString(obliczWartosc() * 0.15) + "z³";
			return obliczWartosc() * 0.85;
		}
		return obliczWartosc();
	}
	public String toString()
	{
		String tempCena = Double.toString(cena) + " z³";
		String tempIle = Integer.toString(ileSztuk) + " szt.";
		String tempWartosc = Double.toString(obliczWartoscZRabatem()) + " z³";
		
		
		for(int i = nazwaTowaru.length()-1; i <= 20; i++) 	nazwaTowaru += " ";
		for(int i = tempCena.length()-1; i <= 10; i++) 		tempCena += " ";
		for(int i = tempIle.length()-1; i <= 4; i++)		tempIle += " ";
		for(int i = tempWartosc.length()-1; i <= 10; i++)	tempWartosc += " ";
		
		
		return nazwaTowaru + " | " + tempCena + " | " + tempIle + " | " + tempWartosc + " " + rabat;  
	}
}