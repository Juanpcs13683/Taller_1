package disk;

/**
 * Clase que representa un disco de musica y sus metodos accesores.
 * @author juanpcs
 *
 */
public class Disk {
	/**
	 * Atributo tipo String que representa el nombre del disco.
	 */
	public String name;
	
	/**
	 * Atributo tipo entero que representa el identificador del disco.
	 */
	private int id;
	
	/**
	 * Atributo tipo String que representa el artista del disco
	 */
	public String artist;

	/**
	 * Metodo constructor para instanciar la clase disco sin inicializar sus atributos.
	 */
	public Disk() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodo constructor para instanciar la clase disco inicializando todos sus atributos.
	 * @param name Nombre del disco.
	 * @param id Identificador del disco.
	 * @param artist Artista del disco.
	 */
	public Disk(String name, int id, String artist) {
		super();
		this.name = name;
		this.id = id;
		this.artist = artist;
	}
	
	/**
	 * Metodo que permite reproducir el disco. 
	 */
	public void play() {
		System.out.println("Playing disk");
	}
	
	/**
	 * Metodo que permite pausar el disco.
	 */
	public void pause() {
		System.out.println("Paused disk");
	}
	
	/**
	 * Metodo que permite detener el disco.
	 */
	public void stop() {
		System.out.println("Stopped disk");
	}
	/**
	 * Metodo accesor que permite obtener el nombre de la instancia actual de disco.
	 * @return Nombre del disco.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Metodo accesor que permite modificar el nombre de la instancia actual de disco.
	 * @param name nombre del disco.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Metodo accesor que permite obtener el identificador de la instancia actual de disco.
	 * @return Id del disco.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Metodo accesor que permite modificar el numero identificador de la instancia actual de disco.
	 * @param id Numero identificador del disco.
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Metodo accesor que permite obtener el artista de la instancia actual de disco.
	 * @return Artista del disco.
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * Metodo accesor que permite modificar el Artista de la instancia actual de disco.
	 * @param artist Artista del disco.
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
}
