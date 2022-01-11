package framework.consoles;

import framework.consoles.additional.ProcessingUnit;
import framework.consoles.additional.Producer;

/**A specific {@link Console} produced by {@code Insomny}.
 * 
 * @author Julien Hemminger (Matr.Nr. 3608881)
 *
 */
public class LearnStation extends Console {
	
	/** a static reference to the {@link Producer} {@code Insomny} since every {@link LearnStation} is produced by them. */
	private static final Producer insomny = new Producer("Insomny");
	
	/**Creates a {@link LearnStation}.
	 * 
	 * @param versionNumber
	 * @param processingUnit
	 */
	public LearnStation(int versionNumber, ProcessingUnit processingUnit) {
		super(versionNumber, insomny, processingUnit);
	}
	
	/**Returns a {@link String} representation of this object.*/
	//@ ensures a string is returned
	@Override
	public String toString() {
		return String.format("LearnStation by %s", getProducer());
	}

}
