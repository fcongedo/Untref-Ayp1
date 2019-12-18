public class Subasta {
	private float precioBase;
	private String articulo;
	private boolean subastaCerrada;
	private float ofertaGanador;

	/**
	 * post: crea una Subasta para el artículo indicado y con el precioBase
	 * indicado.
	 */
	public Subasta(String articulo, float precioBase) {
		if (precioBase > 0 && articulo != "") {
			this.precioBase = precioBase;
			this.articulo = articulo;
			this.subastaCerrada = false;
		} else {
			throw new Error("parametros son incorrectos");
		}

	}

	/**
	 * post: devuelve el artículo que se subasta.
	 */
	public String obtenerArticulo() {
		return this.articulo;

	}

	/**
	 * post: realiza una oferta por el artículo. Si la oferta es mayor al
	 * precioBase y a la ofertaGanarador, esta pasa a ser la nueva
	 * ofertaGanadora.
	 */
	public void ofertar(float oferta) {
		if (oferta <= 0) {
			throw new Error("la oferta debe ser superior a cero");
		}
		if (oferta < precioBase) {
			throw new Error(
					"la oferta debe ser igual o superior al precio base del producto");
		}
		if (oferta > precioBase && oferta > ofertaGanador
				&& !this.subastaCerrada) {
			this.ofertaGanador = oferta;
		}
		if (this.ofertaGanador < oferta && !this.subastaCerrada) {
			ofertaGanador = oferta;
		}
	}

	/**
	 * post: devuelve la máxima oferta realizada sobre la Subasta.
	 */
	public float obtenerOfertaGanadora() {
		return this.ofertaGanador;

	}

	/**
	 * post: cierra la Subasta, cualquier oferta realizada con posterioridad es
	 * ignorada.
	 */
	public void cerrar() {
		this.subastaCerrada = true;
	}

}
