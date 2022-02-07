package person;

import java.util.Date;

public class Person {
	
	/**
	 * Atributo tipo String que representa el nombre de la persona.
	 */
	public String name;
	
	/**
	 * Atributo tipo String que representa el primer apellido de la persona.
	 */
	public String lastName1;
	
	/**
	 * Atributo tipo String que representa el segundo apellido de la persona.
	 */
	public String lastName2;
	
	/**
	 * Atributo tipo Date que representa la fecha de nacimiento de la persona.
	 */
	public Date dateBirth;
	
	/**
	 * Atributo tipo float que representa la altura de la persona.
	 */
	public float height;
	
	/**
	 * Metodo constructor que permite instanciar la clase Persona sin inicializar sus atributos.
	 */
	public Person() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo constructor que permite instanciar la clase Persona inicializando cada uno de sus atributos.
	 * @param name Nombre de la instancia actual de Persona.
	 * @param lastName1 Primer apellido de la instancia actual de persona. 
	 * @param lastName2 Segundo apellido de la instancia actual de persona.
	 * @param dateBirth Fecha de nacimiento de la instancia actual de persona.
	 * @param height Altura de la instancia actual de persona.
	 */
	public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
		super();
		this.name = name;
		this.lastName1 = lastName1;
		this.lastName2 = lastName2;
		this.dateBirth = dateBirth;
		this.height = height;
	}
	
	/**
	 * Metodo accesor que permite obtener el nombre de la instancia actual de persona.
	 * @return Nombre de la persona actual.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Metodo accesor que permite modificar el nombre de la instancia actual de persona.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Metodo que permite obtener el primer apellido de la instancia actual de persona.
	 * @return Primer apellido de persona.
	 */
	public String getLastName1() {
		return lastName1;
	}
	
	/**
	 * Metodo accesor que permite modificar el primer apellido de la instancia actual de persona.
	 * @param lastName1 Primer apellido de la persona.
	 */
	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}
	
	/**
	 * Metodo accesor que permite obtener el segundo apellido de la instancia actual de persona.
	 * @return Segundo apellido de la persona.
	 */
	public String getLastName2() {
		return lastName2;
	}
	
	/**
	 *Metodo accesor que permite modificar el segundo apellido de la instancia actual de persona. 
	 * @param lastName2 Segundo apellido de persona.
	 */
	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}
	
	/**
	 * Metodo accesor que permite obtener la fecha de nacimiento de la instancia actual de persona.
	 * @return Fecha de nacimiento de persona.
	 */
	public Date getDateBirth() {
		return dateBirth;
	}
	
	/**
	 * Metodo accesor que permite modificar la fecha de nacimiento de la instancia actual de persona.
	 * @param dateBirth Fecha de nacimiento de la persona.
	 */
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}
	
	/**
	 * Metodo accesor que permite obtener la altura de la instancia actual de persona.
	 * @return Altura de la persona.
	 */
	public float getHeight() {
		return height;
	}
	
	/**
	 *Metodo accesor que permite modificar la altura de la instancia actual de persona. 
	 * @param height Altura de la persona.
	 */
	public void setHeight(float height) {
		this.height = height;
	}


	
}
