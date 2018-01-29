import java.util.Random;

public class HelloWorld
{
	public static void main ( String[] args )
	{
		Random r = new Random();
	
		int choice = 1 + r.nextInt(15);
		String response = "";
	
		if ( choice == 1 )
			response = "Wahrscheinlich";
		else if ( choice == 2 )
			response = "It is decidedly so";
		else if ( choice == 3 )
			response = "Sehr wahrscheinlich";
		else if ( choice == 4 )
			response = "Ja auf jeden Fall";
		else if ( choice == 5 )
			response = "Frag erneut";
		else if ( choice == 6 )
			response = "Meiner Meinung nach schon";
		else if ( choice == 7 )
			response = "Ziemlich sicher";
		else if ( choice == 8 )
			response = "Sieht gut aus";
		else if ( choice == 9 )
			response = "Die Zeichen sprechen dafür";
		else if ( choice == 10 )
			response = "Ja";
		else if ( choice == 11 )
			response = "Nein";
		else if ( choice == 12 )
			response = "Frag später erneut";
		else if ( choice == 13 )
			response = "Das sage ich dir jetzt nicht";
		else if ( choice == 14 )
			response = "Ich kann gerade nicht vorhersagen";
		else if ( choice == 15 )
			response = "Konzentriere dich, ich kann deine Frage nicht lesen";
		else 
			response = "Computer sagt nein!";
	
		System.out.println( "Die mysthische Miesmuschel sagt" + response );
	}
}