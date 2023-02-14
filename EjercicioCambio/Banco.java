package Singleton.EjercicioCambio;

public class Banco {
    private BancoCentral bancoQuery;

	public Banco(BancoCentral bancoQuery) {
		this.bancoQuery = bancoQuery;
	}

	public double bolivianosToDollars(double bolivianos) {
		double dollars = bancoQuery.bolivianosToDollars(bolivianos);
		return dollars;
	}

	public double bolivianosToEuros(double bolivianos) {
		double euros = bancoQuery.bolivianosToEuros(bolivianos);
		return euros;
	}
	


	public double dollarsToBolivianos(double dollars) {
		double bolivianos = bancoQuery.dollarsToBolivianos(dollars);
		return bolivianos;
	}
	
	public double dollarsToEuros(double dollars){
		double euros = bancoQuery.dollarToEuros(dollars);
		return euros;
	}
	

	
	public double eurosToBolivianos(double euros) {
		double bolivianos = bancoQuery.eurosToBolivianos(euros);
		return bolivianos;
	}
	
	public double eurosToDollar(double euros){
		double dollars = bancoQuery.eurosToDollar(euros);
		return dollars;
	}
}