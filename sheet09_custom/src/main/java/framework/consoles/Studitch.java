package framework.consoles;

import framework.consoles.additional.ProcessingUnit;
import framework.consoles.additional.Producer;

/**A specific {@link Console} produced by {@code Ninwando}.
 * 
 * @author Julien Hemminger (Matr.Nr. 3608881)
 */
public class Studitch extends Console {
	
	/** a static reference to the {@link Producer} {@code Ninwando} since every {@link Studich} is produced by them. */
	private static final Producer ninwando = new Producer("Ninwando");
	
	/**Creates a {@link Studitch}.
	 * 
	 * @param versionNumber
	 * @param processingUnit
	 */
	public Studitch(int versionNumber, ProcessingUnit processingUnit) {
		// defensive assureance by parent class
		super(versionNumber, ninwando, processingUnit);
	}

	/**Returns a {@link String} representation of this object.*/
	//@ ensures a string is returned
	@Override
	public String toString() {
		return String.format("Studitch by %s", getProducer());
	}

}
