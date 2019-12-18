public class Ticket {
	private double importe;
	private boolean ticketAbierto = false;
	private int ticketCantidadDeProductos;
	private double ticketPrecioAcomulado;
	private double descuento;
	private int contadorDescuento = 0;

	/*
	 * post: el Ticket se inicializa con importe 0.
	 */
	public Ticket() {
		importe = 0;

	}

	public boolean abierto() {

		return ticketAbierto;
	}

	/*
	 * pre : cantidad y precio son mayores a cero. El ticket está abierto. post:
	 * suma al Ticket un item a partir de la cantidad de de productos y su
	 * precio unitario.
	 */

	public void agregarItem(int cantidad, double precioUnitario) {
		if (ticketAbierto == true) {
			if (cantidad <= 0 && precioUnitario <= 0) {
				throw new Error(
						"la cantidad y el precio deben ser mayores a cero");
			}
			this.ticketCantidadDeProductos += cantidad;
			this.ticketPrecioAcomulado += precioUnitario;

		}
	}

	/*
	 * pre : el Ticket está abierto y no se ha aplicado un descuento
	 * previamente. post: aplica un descuento sobre el total del importe.
	 */
	public void aplicarDescuento(double porcentaje) {
		ticketAbierto = true;
		if (contadorDescuento > 0) {
			throw new Error("ya se ha aplicado un descuento");
		}
		double descuento = (this.ticketPrecioAcomulado * porcentaje / 100);
		this.ticketPrecioAcomulado = this.ticketPrecioAcomulado - descuento;
		contadorDescuento++;

	}

	/*
	 * post: devuelve el importe acumulado hasta el momento sin cerrar el
	 * Ticket.
	 */
	public double calcularSubtotal() {
		this.ticketAbierto = true;
		return this.ticketPrecioAcomulado;

	}

	/*
	 * post: cierra el Ticket y devuelve el importe total.
	 */
	public double calcularTotal() {
		this.ticketAbierto = false;
		return this.ticketPrecioAcomulado;

	}

	/*
	 * post: devuelve la cantidad total de productos.
	 */
	public int contarProductos() {
		return this.ticketCantidadDeProductos;

	}
}