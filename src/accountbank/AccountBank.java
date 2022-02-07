package accountbank;

public class AccountBank {
	
	/**
	 * Atributo tipo Entero que representa el numero de cuenta.
	 */
	private int accountNumber;
	
	/**
	 * Atributo tipo booleano que representa el estado activo o inactivo de la cuenta.
	 */
	protected boolean activated;
	
	/**
	 * Metodo constructor que permite instanciar la clase AccountBank sin inicializar sus atributos.
	 */
	public AccountBank() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodo constructor que permite instancia la clase AccountBank inicializando cada uno de sus atributos.
	 * @param accountNumber Numero de cuenta bancaria.
	 * @param activated Estado de la cuenta.
	 */
	public AccountBank(int accountNumber, boolean activated) {
		super();
		this.accountNumber = accountNumber;
		this.activated = activated;
	}
	
	/**
	 * Metodo accesor que permite verificar el estado activo o inactivo de la cuenta bancaria.
	 * @return cuenta activa o inactiva.
	 */
	public boolean isActivated() {
		return activated;
	}
	
	/**
	 * Metodo accesor que permite modificar el estado activo o inactivo de la cuenta bancaria.
	 * @param activated Estado activo o inactivo de la cuenta bancaria.
	 */
	public void setActivated(boolean activated) {
		this.activated = activated;
	}


	
	
}
