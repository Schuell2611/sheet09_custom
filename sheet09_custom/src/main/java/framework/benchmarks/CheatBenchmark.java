package framework.benchmarks;

import framework.Software;
import framework.consoles.Console;

/**A cheated benchmark.
 * 
 * @author Julien Hemminger (Matr.Nr. 3608881)
 *
 */
public class CheatBenchmark extends Benchmark {
	
	private final float cheatingFactor = 1.3f;
	
	/**Creates  a {@link CheatedBenchmark}.
	 */
	public CheatBenchmark() {
		super();
	}
	
	/**Returns the calculated performance scaled by a {@code cheatingFactor}.
	 * @see Benchmark#performBenchmark(Console, Software)
	 */
	@Override
	public float performBenchmark(Console console, Software software) {
		return cheatingFactor * super.performBenchmark(console, software);
	}
	
	/**Returns a {@link String} representation of this object.*/
	//@ ensures a string is returned
	@Override
	public String toString() {
		return "Benchmark(cheated)";
	}
}
