package framework;

/**A type representing a piece of software.
 * 
 * @author Julien Hemminger (Matr.Nr. 3608881)
 *
 */
public class Software {
	
	private final String title;
	private final float maximumComputingConsumption;
	
	public Software(String title, float maximumComputingConsumption) {
		// defensive assurence
		if(title == null || title.isEmpty()) {
			throw new IllegalArgumentException("No title provided");
		}
		if(maximumComputingConsumption < 1.0f || maximumComputingConsumption > 100.0f) {
			throw new IllegalArgumentException("The maximumComputingConsumption is not in [1.0, 100.0] range.");
		}
				
		this.title = title;
		this.maximumComputingConsumption = maximumComputingConsumption;	
	}
	
	/**Returns the {@code maximumComputingConsumption} which is in [1.0, 100.0] range.
	 * 
	 * @return maximumComputingConsumption
	 */
	/*@ requires this is initialized
	 *@ ensures maximumComputingConsumption is returned
	  @*/
	public float getMaximumComputingConsumption() {
		return maximumComputingConsumption;
	}
	
	/**Returns a {@link String} representation of this object.*/
	//@ ensures a string is returned
	@Override
	public String toString() {
		return String.format("%s(consumption = %s)", title, maximumComputingConsumption);
	}
}
