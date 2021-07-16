public class BuscadorDePaquetes {
	/**
	 * pre : ... post: devuelve un arreglo con los pesos de aquellos Paquetes
	 * indicados en 'codigos'.
	 */
	public double[] buscarPesosPorCodigo(Paquete[] paquetes, int[] codigos) {
		for (int i = 0; i < codigos.length; i++) {
			if (codigos[i] <= 0) {
				throw new Error("codigos invalidos");
			}
		}
		double[] pesosPorCodigo = new double[codigos.length];
		for (int i = 0; i < codigos.length; i++) {
			if (paquetes[i].obtenerCodigo() == codigos[i]) {
				pesosPorCodigo[i] = paquetes[i].obtenerPeso();
			}
		}
		return pesosPorCodigo;

	}
}