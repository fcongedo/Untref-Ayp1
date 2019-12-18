public class CajaDeAhorro {

	private String titular;
	private double saldoDeCuenta;

	public CajaDeAhorro(String titularDeLaCuenta){
		this.titular = titularDeLaCuenta;
		this.saldoDeCuenta= 0;
	}

	public String obtenerTitular(){
		return this.titular;
	}

	public double consultarSaldo(){
		return this.saldoDeCuenta;
	}

	public void depositar(double monto){
		if(monto <= 0)
			throw new Error("tenes que depositar un saldo mayor a 0");

		this.saldoDeCuenta += monto;
	}

	public void extraer(double monto){

		if(monto < 0)
			throw new Error("tenes que sacar un monto mayor a cero");

		if(monto > this.saldoDeCuenta)
			throw new Error("no tenes suficiente dinero en la cuenta, para extraer dicho monto");

		this.saldoDeCuenta -= monto;

	}	
}