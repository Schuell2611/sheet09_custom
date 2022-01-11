package framework.consoles.additional;

/**A processing-unit type.
 * 
 * @author Julien Hemminger (Matr.Nr. 3608881)
 *
 */
public class ProcessingUnit {
	
	private final String name;
	private final float maximumPerformanceValue; // in [1.0, 100.0] range
	
	/**Creates a {@link ProcessingUnit}.
	 * 
	 * @param name
	 * @param maximumPerformanceValue
	 */
	public ProcessingUnit(String name, float maximumPerformanceValue) {
		// defensive assurence
		if(name == null || name.isEmpty()) {
			throw new IllegalArgumentException("No name provided");
		}
		if(maximumPerformanceValue < 1.0f || maximumPerformanceValue > 100.0f) {
			throw new IllegalArgumentException("The maximumPerformanceValue is not in [1.0, 100.0] range.");
		}
		
		this.name = name;
		this.maximumPerformanceValue = maximumPerformanceValue;
	}
	
	/**Returns the {@code name}.
	 * 
	 * @return name
	 */
	/*@ requires this is initialized
	 *@ ensures name is returned
	  @*/
	public final String getName() {
		return name;
	}
	
	/**Returns the {@code maximumPerformanceValue} which is in [1.0, 100.0] range.
	 * 
	 * @return maximumPerformanceValue
	 */
	/*@ requires this is initialized
	 *@ ensures maximumPerformanceValue is returned
	  @*/
	public final float getMaximumPerformanceValue() {
		return maximumPerformanceValue;
	}
	
	
}
