package framework.consoles.additional;

/**A type representing the producer of a gaming-console.
 * 
 * @author Julien Hemminger (Matr.Nr. 3608881)
 *
 */
public class Producer {

	private final String name;
	
	/**Creates a {@link Producer}.
	 * 
	 * @param name
	 */
	public Producer(String name) {
		this.name = name;
	}
	
	/**Returns a {@link String} representation of this object.*/
	//@ ensures a string is returned
	@Override
	public String toString() {
		return name;
	}
}
