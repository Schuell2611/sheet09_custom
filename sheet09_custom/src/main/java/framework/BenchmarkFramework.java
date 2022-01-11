package framework;

import java.util.ArrayList;
import java.util.List;

import framework.benchmarks.Benchmark;
import framework.benchmarks.CheatBenchmark;
import framework.consoles.Console;
import framework.consoles.LearnStation;
import framework.consoles.Studitch;
import framework.consoles.additional.ProcessingUnit;

//TODO: absicherung (def/pos)
//pos: B.Framework, Software, 

public class BenchmarkFramework {
	
	private final Console console;
	private final Benchmark benchmark;
	private final List<Software> softwareList;
	
	/**Creates a new {@link BenchmarkFramework} using the specified
	 * {@link Console}, {@link Benchmark} and a {@link List} containing {@link Software}.
	 * 
	 * @param console
	 * @param benchmark
	 * @param softwareList
	 */
	private BenchmarkFramework(final Console console, final Benchmark benchmark, final List<Software> softwareList) {
		// defensive assureance
		if(console == null) {
			throw new IllegalArgumentException("No console provided.");
		}
		if(benchmark == null) {
			throw new IllegalArgumentException("No benchmark provided.");
		}
		if(softwareList == null || softwareList.isEmpty()) {
			throw new IllegalArgumentException("No software is provided to perform benchmarks.");
		}
		
		this.console = console;
		this.benchmark = benchmark;
		this.softwareList = softwareList;
	}
	
	/**Performs a benchmark for every {@link Software} referenced by this
	 * {@link BenchmarkFramework}. The performance values are displayed
	 * separatly in the console.
	 */
	/*@
	 *@ requires this object is initialized
	 *@ requires this.softwareList.size() > 0
	 *@ ensures a message is displayed in the console
	  @*/
	public void printBenchmarkPerSoftware() {
		
		System.out.format("\n%s using %s:\n", benchmark, console);
		
		for(Software software : softwareList) {
			float performance = benchmark.performBenchmark(console, software);
			System.out.format("  using software %s: performance = %s\n", software, performance);	
		}
	}
	
	// main-Method
	public static void main(String[] args) {
		// software
		List<Software> softwareList = new ArrayList<Software>();
		softwareList.add(new Software("T1", 33.0f));
		softwareList.add(new Software("T2", 50.0f));
		softwareList.add(new Software("T3", 66.0f));
		
		// consoles
		Console learnStation = new LearnStation(1, new ProcessingUnit("R3000", 75.0f));
		Console studitch = new Studitch(2, new ProcessingUnit("ARM 4", 66.0f));
		
		// frameworks
		BenchmarkFramework framework1 = new BenchmarkFramework(learnStation, new Benchmark(), softwareList);
		BenchmarkFramework framework2 = new BenchmarkFramework(studitch, new Benchmark(), softwareList);
		
		BenchmarkFramework framework3 = new BenchmarkFramework(learnStation, new CheatBenchmark(), softwareList);
		BenchmarkFramework framework4 = new BenchmarkFramework(studitch, new CheatBenchmark(), softwareList);
		
		System.out.print("====== using a regular benchmark ======");
		framework1.printBenchmarkPerSoftware();
		framework2.printBenchmarkPerSoftware();
		
		System.out.print("\n====== using a cheated benchmark ======");
		framework3.printBenchmarkPerSoftware();
		framework4.printBenchmarkPerSoftware();
	}
	
}