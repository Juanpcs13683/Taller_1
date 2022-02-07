package fruit;

import java.util.ArrayList;

/**
 * Representa una fruta y sus metodos accesores.
 * @author juanpcs
 *
 */
public class Fruit {
	
	/**
	 * Representa el nombre de la fruta.
	 */
	public String name;
	
	/**
	 * Representa el peso promedio de la fruta.
	 */
	private float averageWeight;
	
	/**
	 * Representa un arreglo dinamico para almacenar el color de la instancia actual de fruta.
	 */
	public ArrayList<String> colors = new ArrayList<>();
	
	
	/**
	 * Metodo constructor que permite instanciar fruta sin inicializar los atributos de esta.
	 */
	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo constructor para instanciar el objeto fruta inicializando todos sus atributos.
	 * @param name Parametro que inicializa el nombre de la instancia actual de fruta.
	 * @param averageWeight Parametro que inicialiaza el atributo peso promedio de la instancia actual de fruta. 
	 * @param colors parametro que inicializa el atributo color de la instancia actual de fruta y se guarda en el arreglo dinamico colors.
	 */
	public Fruit(String name, float averageWeight, ArrayList<String> colors) {
		super();
		this.name = name;
		this.averageWeight = averageWeight;
		this.colors = colors;
	}
	
	/**
	 * Metodo accesor para obtener el atributo nombre de la instancia actual de fruta.
	 * @return nombre de la instancia actual de fruta.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Metodo accesor que permite modificar el atributo nombre de la instancia actual de fruta.
	 * @param name nombre de la fruta.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Metodo accesor para obtener el peso promedio de la instancia actual de fruta.
	 * @return Peso promedio de la instancia actual de fruta.
	 */
	public float getAverageWeight() {
		return averageWeight;
	}
	
	/**
	 * Metodo accesor que permite modificar el peso promedio de la instancia actual de fruta.
	 * @param averageWeight Peso promedio de la fruta.
	 */
	public void setAverageWeight(float averageWeight) {
		this.averageWeight = averageWeight;
	}
	
	/**
	 * Metodo accesor para obtener el color de instancia actual de fruta.
	 * @return color de la fruta.
	 */
	public ArrayList<String> getColors() {
		return colors;
	}
	
	/**
	 *Metodo accesor que permite modificar el atributo color de la instancia actual de fruta. 
	 * @param colors Color de la fruta.
	 */
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}
	
	
	
}
