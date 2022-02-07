package speaker;

/**
 * Clase que representa una bocina y algunas de sus funciones.
 * @author juanpcs
 *
 */
public class Speaker {
	
	/**
	 * Atributo de tipo String que representa el tipo de bocina.
	 */
	String type;
	
	/**
	 * Atributo tipo String que representa la fuente de entrada de sonido de la bocina.
	 */
	String input;
	
	/**
	 * Atributo tipo entero que representa el volumen actual de la bocina.
	 */
	int volume;
	
	/**
	 * Metodo constructor que permite instanciar la clase Speaker sin inicializar sus atributos.
	 */
	public Speaker() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodo constructor que permite instanciar la clase Speaker inicializando cada uno de sus atributos.
	 * @param type Tipo de bocina.
	 * @param input Entrada de sonido.
	 * @param volume Volumen de la bocina.
	 */
	public Speaker(String type, String input, int volume) {
		super();
		this.type = type;
		this.input = input;
		this.volume = volume;
	}
	
	/**
	 * Metodo accesor que permite obtener el tipo de bocina de la instancia actual de Speaker.
	 * @return Tipo de bocina.
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Metodo accesor que permite modificar el tipo de bocina de la instancia actual de Speaker.
	 * @param type Tipo de bocina.
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Metodo accesor que permite obtener el tipo de entrada de la instancia actual de Speaker.
	 * @return Entrada de sonido a la bocina.
	 */
	public String getInput() {
		return input;
	}
	
	/**
	 * Metodo accesor que permite modificar el tipo de entrada de audio de la instancia actual de Speaker.
	 * @param input Entrada de sonido a la bocina.
	 */
	public void setInput(String input) {
		this.input = input;
	}

	/**
	 * Metodo accesor que permite obtener el volumen de la intancia actual de Speaker.
	 * @return Volumen de la bocina.
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * Metodo accesor que permite modificar el volumen de la instancia actual de Speaker.
	 * @param volume Volumen de la bocina.
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
