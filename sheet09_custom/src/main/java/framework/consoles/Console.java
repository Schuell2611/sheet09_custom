package framework.consoles;


import framework.consoles.additional.ProcessingUnit;
import framework.consoles.additional.Producer;

/**An abstract {@link Console} type.
 * 
 * @author Julien Hemminger (Matr.Nr. 3608881)
 */
public abstract class Console {
	
	private final int versionNumber;
	private final Producer producer;
	private final ProcessingUnit processingUnit;
	
	/**Creates a {@link Console}.
	 * 
	 * @param versionNumber
	 * @param producer
	 * @param processingUnit
	 */
	public Console(int versionNumber, Producer producer, ProcessingUnit processingUnit) {
		// defensive assureance
		if(producer == null) {
			throw new IllegalArgumentException("No producer provided");
		}
		if(processingUnit == null) {
			throw new IllegalArgumentException("No processingUnit provided");
		}
		
		this.versionNumber = versionNumber;
		this.producer = producer;
		this.processingUnit = processingUnit;
	}
	
	/**Returns this consoles {@code versionNumber}.
	 * @return versionNumber
	 */
	/*@ requires this is initialized
	 *@ ensures the versionNumber is returned
	  @*/
	public final int getVersionNumber() {
		return versionNumber;
	}
	
	/**Returns this consoles {@code processingUnit}.
	 * @return processingUnit
	 */
	/*@ requires this is initialized
	 *@ ensures the processingUnit is returned
	  @*/
	public final ProcessingUnit getProcessingUnit() {
		return processingUnit;
	}
	
	/**Returns this consoles {@code producer}
	 * @return producer
	 */
	/*@ requires this is initialized
	 *@ ensures the producer is returned
	  @*/
	public Producer getProducer() {
		return producer;
	}
	
}
