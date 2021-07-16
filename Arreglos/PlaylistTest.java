import org.junit.Assert;
import org.junit.Test;

public class PlaylistTest {

	@Test(expected = Error.class)
	public void EsperoUnErrorAlCrearPlaylistConCantidadDeCancionesIgualACero() {

		Playlist a = new Playlist(0);
	}

	@Test(expected = Error.class)
	public void EsperoUnErrorAlCrearPlaylistConCantidadDeCancionesNegativo() {

		Playlist a = new Playlist(-10);
	}

	@Test(expected = Error.class)
	public void PrueboAgregar3CancionesAlaPlaylistAUnaPlaylistConCantidadDeCancionesIgualADosDaError() {

		Playlist a = new Playlist(2);
		Cancion NuevaCancion = new Cancion("Chau", 2);
		Cancion NuevaCancion2 = new Cancion("Hola", 3);
		Cancion NuevaCancion3 = new Cancion("aloja", 4);
		a.agregarUnaCancion(NuevaCancion);
		a.agregarUnaCancion(NuevaCancion3);
		a.agregarUnaCancion(NuevaCancion2);
	}

	@Test
	public void CreaUnaPlaylistConCantidadDeCancionesIgualADiez() {

		Playlist a = new Playlist(10);
		Assert.assertEquals(10, a.ObtenerCantidadMaximaDeCanciones());
	}

	@Test
	public void PrueboAgregarUnaCancionAPlaylist() {

		Playlist a = new Playlist(10);
		Cancion NuevaCancion = new Cancion("Chau", 2);
		a.agregarUnaCancion(NuevaCancion);

	}

	@Test
	public void PrueboAgregar3CancionesAlaPlaylist() {

		Playlist a = new Playlist(10);
		Cancion NuevaCancion = new Cancion("Chau", 2);
		Cancion NuevaCancion2 = new Cancion("Hola", 3);
		Cancion NuevaCancion3 = new Cancion("aloja", 4);
		a.agregarUnaCancion(NuevaCancion);
		a.agregarUnaCancion(NuevaCancion3);
		a.agregarUnaCancion(NuevaCancion2);
		Assert.assertEquals(3, a.obtenerCantidadCanciones());

	}

	@Test
	public void PrueboAgregar3CancionesElMetodoObtenerDuracionTotalEnSegundosEs() {

		Playlist a = new Playlist(10);
		Cancion NuevaCancion = new Cancion("Chau", 2.01);
		Cancion NuevaCancion2 = new Cancion("Hola", 3.20);
		Cancion NuevaCancion3 = new Cancion("aloja", 4.30);
		a.agregarUnaCancion(NuevaCancion);
		a.agregarUnaCancion(NuevaCancion3);
		a.agregarUnaCancion(NuevaCancion2);
		Assert.assertEquals(570.60, a.duracionTotalPlayListEnSegundos(), 0);

	}

	@Test
	public void PrueboObtenerTituloCancionAPartirDeSuPosicion() {
		Playlist a = new Playlist(10);
		Cancion NuevaCancion = new Cancion("Chau", 2.00);
		Cancion NuevaCancion2 = new Cancion("Hola", 3.00);
		Cancion NuevaCancion3 = new Cancion("aloja", 4.00);
		a.agregarUnaCancion(NuevaCancion);
		a.agregarUnaCancion(NuevaCancion2);
		a.agregarUnaCancion(NuevaCancion3);
		Assert.assertEquals("Hola", a.nombreCancion(2));

	}

	@Test
	public void PrueboObtenerDuracionCancionAPartirDeSuPosicion() {
		Playlist a = new Playlist(10);
		Cancion NuevaCancion = new Cancion("Chau", 2.00);
		Cancion NuevaCancion2 = new Cancion("Hola", 3.00);
		Cancion NuevaCancion3 = new Cancion("aloja", 4.00);
		a.agregarUnaCancion(NuevaCancion);
		a.agregarUnaCancion(NuevaCancion2);
		a.agregarUnaCancion(NuevaCancion3);
		Assert.assertEquals(3.00, a.obtenerDuracionCancion(2), 0);

	}
	
}
