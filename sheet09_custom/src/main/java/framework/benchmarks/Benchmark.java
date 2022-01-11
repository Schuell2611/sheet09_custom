package framework.benchmarks;

import framework.Software;
import framework.consoles.Console;

/**A regular benchmark type.
 * 
 * @author Julien Hemminger (Matr.Nr. 3608881)
 *
 */
public class Benchmark {
	
	/**Creates a regular {@link Benchmark}.
	 */
	public Benchmark() {
		// devensive assurance not required
	}
	
	/**Computes the performance of the {@link Console} running the specified
	 * {@link Software} and returns it.
	 * 
	 * @param console
	 * @param software
	 * @return the performance
	 */
	/*@ requires console is initialized
	 *@ requires software is initialized
	 *@ ensures performance is returned
	  @*/
	public float performBenchmark(final Console console, final Software software) {
		float consumption = software.getMaximumComputingConsumption();
		float performance = console.getProcessingUnit().getMaximumPerformanceValue();
		return performance / consumption;
	}
	
	/**Returns a {@link String} representation of this object.*/
	//@ ensures a string is returned
	@Override
	public String toString() {
		return "Benchmark(regular)";
	}
}
