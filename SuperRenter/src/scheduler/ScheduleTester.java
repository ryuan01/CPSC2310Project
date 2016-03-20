package scheduler;

import java.io.IOException;

public class ScheduleTester {

	public static void main(String[] args) throws IOException {
		
		Root testRoot = new Root();
		
		ScheduleFunction.clear();
		
		System.out.println("Attempting To Reserve Day 1: Should Return Success");
		System.out.println(testRoot.post("1"));
		
		System.out.println("Attempting To Reserve Day 1: Should Return Not Successful");
		System.out.println(testRoot.post("1"));
		
		System.out.println("Attempting To Reserve Day 5: Should Return Success");
		System.out.println(testRoot.post("5"));
		
		System.out.println("Attempting To Reserve Day 3: Should Return Success");
		System.out.println(testRoot.post("3"));
		
		System.out.println("Attempting To Reserve Day 5: Should Return Not Successful");
		System.out.println(testRoot.post("5"));
		
		
		
		
		
	}

}
