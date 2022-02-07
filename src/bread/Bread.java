package bread;

import java.util.ArrayList;

/**
 * Clase que representa un pan y algunas de sus caracteristicas.
 * @author juanpcs
 *
 */
public class Bread {
	
	/**
	 * Atributo tipo String que representa el tipo de pan.
	 */
	public String type_of_bread;
	
	/**
	 * Atributod tipo entero que representa el costo del pan.
	 */
	private int cost;
	
	/**
	 * Atributo tipo String que representa el metodo de preparacion del pan.
	 */
	public String manufacturing_method;
	
	/**
	 * Arreglo dinamico donde se guarda cada instancia de la clase.
	 */
	ArrayList<Bread> breadList = new ArrayList<>();
	
	/**
	 * Metodo constructor que permite instanciar la clase sin inicializar sus atributos.
	 */
	public Bread() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo constructor que permite instanciar la clase inicializando cada uno de sus atributos.
	 * @param type_of_bread Tipo de pan.
	 * @param cost Costo del pan.
	 * @param manufacturing_method Metodo de preparacion del pan.
	 */
	public Bread(String type_of_bread, int cost, String manufacturing_method) {
		super();
		this.type_of_bread = type_of_bread;
		this.cost = cost;
		this.manufacturing_method = manufacturing_method;
	}
	
	/**
	 * Metodo que permite instanciar un objeto de la clase pan, guardandolo a su vez en un arreglo.
	 * @param type_of_bread Tipo de pan.
	 * @param cost Costo del pan.
	 * @param manufacturing_method Metodo de preparacion del pan.
	 */
	public void createBread(String type_of_bread, int cost, String manufacturing_method) {
		try {
			this.breadList.add(new Bread(type_of_bread, cost, manufacturing_method));
			System.out.println("Bread successfully added");
		} catch (Exception e) {
			System.out.println("Error adding bread to bread list");
		}
		
	}
	
	/**
	 * Metodo accesor que permite obtenet el tipo de pan de la instancia actual de la clase pan.
	 * @return Tipo de pan.
	 */
	public String getType_of_bread() {
		return type_of_bread;
	}

	/**
	 * Metodo accesor que permite modificar el tipo de pan de la actual instancia de la clase pan.
	 * @param type_of_bread Tipo de pan.
	 */
	public void setType_of_bread(String type_of_bread) {
		this.type_of_bread = type_of_bread;
	}

	/**
	 * Metodo accesor que permite obtener el costo de la actual instancia de la clase pan.
	 * @return Costo del pan.
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * Metodo accesor que pemite modificar el costo de la actual instancia de la clase pan.
	 * @param cost Costo del pan.
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * Metodo accesor que permite obtener el metodo de fabricacion de la actual instancia de la clase pan.
	 * @return Metodo de fabricacion.
	 */
	public String getmanufacturing_method() {
		return manufacturing_method;
	}
	
	/**
	 * Metodo accesor que permite modificar el metodo de fabricacion de la actual instancia de la clase pan.
	 * @param manufacturing_method Metodo de fabricacion.
	 */
	public void setmanufacturing_method(String manufacturing_method) {
		this.manufacturing_method = manufacturing_method;
	}

	
	
}
