package Singleton.EjercicioCambio;

public class Main {
    public static void main(String[] args) {
		BancoCentral bancoQuery = BancoCentral.getBancoCentral();

		Banco bancoLocal = new Banco(bancoQuery);
		Librecambista librecambista = new Librecambista(bancoQuery);
		CasaDeCambio casaDeCambio = new CasaDeCambio(bancoQuery);

		System.out.println("Banco: 70 Bs -> $ " + bancoLocal.bolivianosToDollars(70));
		System.out.println("Casa de Cambio: 70 Bs -> $ " + casaDeCambio.bolivianosToDollars(70));
		System.out.println("LibreCambista: 70 Bs -> $ " + librecambista.bolivianosToDollars(70));

		System.out.println("Banco: 70 Bs -> $ " + bancoLocal.bolivianosToDollars(70));
		System.out.println("Casa de Cambio: 10 $ -> Bs " + casaDeCambio.dollarsToBolivianos(10));
		System.out.println("LibreCambista: 1 Euro -> Bs " + librecambista.eurosToBolivianos(1));

		System.out.println("cambio de bolivianos a dolares");
		System.out.println("Banco: 10 Bs -> $ " + bancoLocal.bolivianosToDollars(10));
		System.out.println("Casa de Cambio: 10 Bs -> $ " + casaDeCambio.bolivianosToDollars(10));
		System.out.println("LibreCambista: 10 Bs -> $ " + librecambista.bolivianosToDollars(10));

		System.out.println("cambio de bolivianos a euros");
		System.out.println("Banco: 10 Bs -> Euros " + bancoLocal.bolivianosToEuros(10));
		System.out.println("Casa de Cambio: 10 Bs -> Euros " + casaDeCambio.bolivianosToEuros(10));
		System.out.println("LibreCambista: 10 Bs -> Euros " + librecambista.bolivianosToEuros(10));


		System.out.println("cambio de dolares a bolivianos");
		System.out.println("Banco: 10 $ -> Bs " + bancoLocal.dollarsToBolivianos(10));
		System.out.println("Casa de Cambio: 10 $ -> Bs " + casaDeCambio.dollarsToBolivianos(10));
		System.out.println("LibreCambista: 10 $ -> Bs " + librecambista.dollarsToBolivianos(10));

		System.out.println("cambio de dolares a euros");
		System.out.println("Banco: 10 $ -> Euros " + bancoLocal.dollarsToEuros(10));
		System.out.println("Casa de Cambio: 10 $ -> Euros " + casaDeCambio.dollarsToEuros(10));
		System.out.println("LibreCambista: 10 $ -> Euros " + librecambista.dollarsToEuros(10));


		System.out.println("cambio de euros a bolivianos");
		System.out.println("Banco: 10 Euros -> Bs " + bancoLocal.eurosToBolivianos(10));
		System.out.println("Casa de Cambio: 10 Euros -> Bs " + casaDeCambio.eurosToBolivianos(10));
		System.out.println("LibreCambista: 10 Euros -> Bs " + librecambista.eurosToBolivianos(10));
		
		System.out.println("cambio de euros a dolares");
		System.out.println("Banco: 10 Euros -> $ " + bancoLocal.eurosToDollar(10));
		System.out.println("Casa de Cambio: 10 Euros -> $ " + casaDeCambio.eurosToDollar(10));
		System.out.println("LibreCambista: 10 Euros -> $ " + librecambista.eurosToDollar(10));
	}
 
}
