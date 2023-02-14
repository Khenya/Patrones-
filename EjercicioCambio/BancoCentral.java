package Singleton.EjercicioCambio;

public class BancoCentral {
    private static BancoCentral bancoCentral;

	private BancoCentral() {
		System.out.println("*********Banco central***********");
	}

	public static BancoCentral getBancoCentral() {
		if (bancoCentral == null) {
			bancoCentral = new BancoCentral();
		}
		return bancoCentral;
	}

	public double bolivianosToDollars(double bolivianos) {
		double dollars = bolivianos / 7.0;
		return dollars;
	}

	public double bolivianosToEuros(double bolivianos) {
		double euros = bolivianos / 9.0;
		return euros;
	}



	public double dollarsToBolivianos(double dollars) {
		double bolivianos = dollars * 7.0;
		return bolivianos;
	}
	
	public double dollarToEuros(double dollars) {
		double euros = dollars * 2.0;
		return euros;
	}


	
	public double eurosToBolivianos(double euros) {
		double bolivianos = euros * 9.0;
		return bolivianos;
	}
	
	public double eurosToDollar(double euros) {
		double dollars = euros * 0.9;
		return dollars;
	}
	
}